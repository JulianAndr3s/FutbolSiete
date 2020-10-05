import { Component, OnInit } from '@angular/core';
import { Reserva } from 'src/app/shared/modelos/reserva';
import { ReservaService } from 'src/app/shared/servicios/reserva.service';

@Component({
  selector: 'app-reserva',
  templateUrl: './reserva.component.html',
  styleUrls: ['./reserva.component.scss']
})
export class ReservaComponent implements OnInit {

  public reserva: Reserva = new Reserva();
  public reservas: Reserva[];
  public reservaSeleccionada: Reserva = new Reserva();
  constructor(private reservaService: ReservaService) { }

  ngOnInit() {
    this.listarReservas();
  }

  listarReservas() {
    this.reservaService.listarReservas().subscribe(
      (reserva) => {
        this.reservas = reserva;
      }
    );
  }

  mostrarModal(reserva: Reserva) {
    this.reservaSeleccionada = reserva;
  }

  eliminarReserva(id: number) {
    this.reservaService.eliminarReserva(id).subscribe(
      _ => (
        this.reservas = this.reservas.filter(reserva => reserva !== this.reservaSeleccionada)
      )
    );
  }
}
