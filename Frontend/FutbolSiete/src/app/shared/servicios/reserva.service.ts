import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Endpoints } from '../constantes/endpoints';
import { Header } from '../constantes/headers';
import { Reserva } from '../modelos/reserva';

@Injectable({
  providedIn: 'root'
})
export class ReservaService {

  constructor(private http: HttpClient) { }

  listarReservas(): Observable<Reserva[]> {
    return this.http.get<Reserva[]>(Endpoints.RESERVA);
  }

  insertarReserva(reserva: Reserva): Observable<Reserva> {
    return this.http.post<Reserva>(Endpoints.RESERVA, reserva, {headers: Header.HEADER_JSON});
  }

  eliminarReserva(id: number): any {
    return this.http.delete<Reserva>(Endpoints.RESERVA.concat('/').concat(id.toString()), {headers: Header.HEADER_TEXT});
  }
}
