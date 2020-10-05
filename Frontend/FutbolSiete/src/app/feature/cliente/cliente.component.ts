import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Cliente } from 'src/app/shared/modelos/cliente';
import { ClienteService } from '../../shared/servicios/cliente.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss']
})
export class ClienteComponent implements OnInit {

  public clientes: Cliente[];
  public cliente: Cliente = new Cliente();
  public clienteActualizar: Cliente = new Cliente();
  public clienteSeleccionado: Cliente = new Cliente();

  formularioClientes: FormGroup;

  constructor(private clienteServicio: ClienteService, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.listarClientes();
    this.iniciarFormulario();
  }

  listarClientes() {
    this.clienteServicio.listarClientes().subscribe(
      cliente => {
        this.clientes = cliente;
      }
    );
  }

  iniciarFormulario(){
    this.formularioClientes = this.formBuilder.group({
      nombre: [this.clienteSeleccionado.nombre],
      apellido: [this.clienteSeleccionado.apellido],
      telefono: [this.clienteSeleccionado.telefono],
      correo: [this.clienteSeleccionado.correo],
      cedula: [{ value: this.clienteSeleccionado.cedula, disabled: true }],
    });
  }

  get formulario() {
    return this.formularioClientes.controls;
  }

  mostrarModal(cliente: Cliente) {
    this.clienteSeleccionado = cliente;
    this.iniciarFormulario();
  }

  eliminarCliente(cedula: string) {
    this.clienteServicio.eliminarCliente(cedula).subscribe(
      _ => (
        this.clientes = this.clientes.filter(cliente => cliente !== this.clienteSeleccionado)
      )
    );
  }

  actualizarCliente() {
    this.clienteActualizar.id = this.clienteSeleccionado.id;
    this.clienteActualizar.cedula = this.formulario.cedula.value;
    this.clienteActualizar.nombre = this.formulario.nombre.value;
    this.clienteActualizar.apellido = this.formulario.apellido.value;
    this.clienteActualizar.telefono = this.formulario.telefono.value;
    this.clienteActualizar.correo = this.formulario.correo.value;

    this.clienteServicio.actualizarCliente(this.clienteActualizar).subscribe(
      _ => {
        this.listarClientes();
      }
    );
  }

}
