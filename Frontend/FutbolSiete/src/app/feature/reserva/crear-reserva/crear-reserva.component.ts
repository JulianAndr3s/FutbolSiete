import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../../../shared/servicios/cliente.service';
import { CanchaService } from '../../../shared/servicios/cancha.service';
import { ReservaService } from '../../../shared/servicios/reserva.service';
import { Cliente } from '../../../shared/modelos/cliente';
import { Cancha } from '../../../shared/modelos/cancha';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Reserva } from '../../../shared/modelos/reserva';
import { Router } from '@angular/router';

@Component({
  selector: 'app-crear-reserva',
  templateUrl: './crear-reserva.component.html',
  styleUrls: ['./crear-reserva.component.scss']
})
export class CrearReservaComponent implements OnInit {

  clientes: Cliente[];
  canchas: Cancha[];
  reserva: Reserva = new Reserva();

  formularioReservas: FormGroup;

  constructor(private clienteServicio: ClienteService, private canchaServicio: CanchaService, private reservaServicio: ReservaService,
              private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.listarComponentes();
    this.iniciarFormulario();
  }

  iniciarFormulario() {
    this.formularioReservas = this.formBuilder.group({
      cliente: ['', [Validators.required]],
      cancha: ['', [Validators.required]],
      fecha: ['', [Validators.required]],
    });
  }

  get formulario() {
    return this.formularioReservas.controls;
  }

  listarComponentes() {
    this.clienteServicio.listarClientes().subscribe(
      (cliente) => {
        this.clientes = cliente;
      }
    );
    this.canchaServicio.listarCanchas().subscribe(
      (cancha) => {
        this.canchas = cancha;
      }
    );
  }

  crearReserva() {
    this.clientes.forEach(cliente => {
      if (cliente.cedula === this.formulario.cliente.value) {
        this.reserva.cliente = cliente;
      }
    });

    this.canchas.forEach(cancha => {
      if (cancha.id.toString() === this.formulario.cancha.value) {
        this.reserva.cancha = cancha;
      }
    });

    this.reserva.fecha = this.formulario.fecha.value;
    this.reserva.pagoTotal = this.reserva.cancha.valorCancha;

    this.reservaServicio.insertarReserva(this.reserva).subscribe(
      _ => {
        this.router.navigate(['/reservas']);
      }
    );

  }

}
