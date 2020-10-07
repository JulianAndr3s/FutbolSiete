import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ReservaComponent } from './reserva.component';
import { CrearReservaComponent } from './crear-reserva/crear-reserva.component';


const routes: Routes = [
  {
    path: '',
    component: ReservaComponent,
  },
  {
    path: 'crear-reserva',
    component: CrearReservaComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ReservaRoutingModule { }