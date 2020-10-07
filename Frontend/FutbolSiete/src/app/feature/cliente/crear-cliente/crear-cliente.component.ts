import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/shared/modelos/cliente';
import { ClienteService } from 'src/app/shared/servicios/cliente.service';

@Component({
  selector: 'app-crear-cliente',
  templateUrl: './crear-cliente.component.html',
  styleUrls: ['./crear-cliente.component.scss']
})
export class CrearClienteComponent implements OnInit {

  public cliente: Cliente = new Cliente();
  formularioClientes: FormGroup;
  formularioEnviado = false;

  constructor(private clienteServicio: ClienteService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.iniciarFormulario();
  }

  iniciarFormulario(){
    this.formularioClientes = this.formBuilder.group({
      nombre: ['', [Validators.required]],
      apellido: ['', [Validators.required]],
      telefono: ['', [Validators.required]],
      correo: ['', [Validators.required]],
      cedula: ['', [Validators.required]],
    });
  }

  get formulario() {
    return this.formularioClientes.controls;
  }

  crearCliente(){
    this.cliente.nombre = this.formulario.nombre.value;
    this.cliente.apellido = this.formulario.apellido.value;
    this.cliente.telefono = this.formulario.telefono.value;
    this.cliente.correo = this.formulario.correo.value;
    this.cliente.cedula = this.formulario.cedula.value;

    this.formularioEnviado = true;

    if(this.formularioClientes.valid){
      this.clienteServicio.insertarCliente(this.cliente).subscribe(
        _ => {
          this.router.navigate(['/clientes']);
        }
      );
    }
    
  }

}
