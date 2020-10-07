import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Endpoints } from '../constantes/endpoints';
import { Cliente } from '../modelos/cliente';
import { Observable } from 'rxjs';
import { Header } from '../constantes/headers';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class ClienteService {

  constructor(private http: HttpClient) { }

  listarClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(environment.apiUrl.concat(Endpoints.CLIENTE));
  }

  insertarCliente(cliente: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(environment.apiUrl.concat(Endpoints.CLIENTE), cliente, {headers: Header.HEADER_JSON});
  }

  eliminarCliente(cedula: string): any {
    return this.http.delete<Cliente>(environment.apiUrl.concat(Endpoints.CLIENTE).concat('/').concat(cedula), {headers: Header.HEADER_TEXT});
  }

  actualizarCliente(cliente: Cliente): any {
    return this.http.put<Cliente>(environment.apiUrl.concat(Endpoints.CLIENTE), cliente, {headers: Header.HEADER_JSON} );
  }
}
