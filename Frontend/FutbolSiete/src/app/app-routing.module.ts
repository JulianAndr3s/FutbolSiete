import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanchaComponent } from './feature/cancha/cancha.component';
import { CrearCanchaComponent } from './feature/cancha/crear-cancha/crear-cancha.component';
import { ClienteComponent } from './feature/cliente/cliente.component';
import { CrearClienteComponent } from './feature/cliente/crear-cliente/crear-cliente.component';
import { HomeComponent } from './feature/home/home.component';
import { CrearReservaComponent } from './feature/reserva/crear-reserva/crear-reserva.component';
import { ReservaComponent } from './feature/reserva/reserva.component';

const routes: Routes = [
  {path: 'crear-cliente', component: CrearClienteComponent},
  {path: 'crear-reserva', component: CrearReservaComponent},
  {path: 'crear-cancha', component: CrearCanchaComponent},
  {path: 'clientes', component: ClienteComponent},
  {path: 'canchas', component: CanchaComponent},
  {path: 'reservas', component: ReservaComponent},
  {path: 'principal', component: HomeComponent},
  {path: '**', pathMatch: 'full', redirectTo: 'principal'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
