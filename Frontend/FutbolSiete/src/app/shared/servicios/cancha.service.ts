import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Endpoints } from '../constantes/endpoints';
import { Header } from '../constantes/headers';
import { Cancha } from '../modelos/cancha';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CanchaService {

  constructor(private http: HttpClient) { }

  listarCanchas(): Observable<Cancha[]> {
    return this.http.get<Cancha[]>(environment.apiUrl.concat(Endpoints.CANCHA));
  }

  insertarCancha(cancha: Cancha): Observable<Cancha> {
    return this.http.post<Cancha>(environment.apiUrl.concat(Endpoints.CANCHA), cancha, {headers: Header.HEADER_JSON});
  }

  eliminarCancha(id: number): any {
    return this.http.delete<Cancha>(environment.apiUrl.concat(Endpoints.CANCHA.concat('/').concat(id.toString())), {headers: Header.HEADER_TEXT});
  }

  actualizarCancha(cancha: Cancha): any {
    return this.http.put<Cancha>(environment.apiUrl.concat(Endpoints.CANCHA), cancha, {headers: Header.HEADER_JSON} );
  }

}
