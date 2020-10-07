import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Endpoints } from '../constantes/endpoints';
import { Header } from '../constantes/headers';
import { Reserva } from '../modelos/reserva';

@Injectable({
  providedIn: 'root'
})
export class ReservaService {

  constructor(private http: HttpClient) { }

  listarReservas(): Observable<Reserva[]> {
    return this.http.get<Reserva[]>(environment.apiUrl.concat(Endpoints.RESERVA));
  }

  insertarReserva(reserva: Reserva): Observable<Reserva> {
    return this.http.post<Reserva>(environment.apiUrl.concat(Endpoints.RESERVA), reserva, {headers: Header.HEADER_JSON});
  }

  eliminarReserva(id: number): any {
    return this.http.delete<Reserva>(environment.apiUrl.concat(Endpoints.RESERVA).concat('/').concat(id.toString()), {headers: Header.HEADER_TEXT});
  }
}
