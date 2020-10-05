import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './feature/home/home.component';
import { ClienteComponent } from './feature/cliente/cliente.component';
import { CabeceraComponent } from './shared/componentes/cabecera/cabecera.component';
import { ReservaComponent } from './feature/reserva/reserva.component';
import { CanchaComponent } from './feature/cancha/cancha.component';
import { CrearCanchaComponent } from './feature/cancha/crear-cancha/crear-cancha.component';
import { CrearClienteComponent } from './feature/cliente/crear-cliente/crear-cliente.component';
import { CrearReservaComponent } from './feature/reserva/crear-reserva/crear-reserva.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ClienteService } from './shared/servicios/cliente.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ClienteComponent,
    CabeceraComponent,
    ReservaComponent,
    CanchaComponent,
    CrearCanchaComponent,
    CrearClienteComponent,
    CrearReservaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [ClienteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
