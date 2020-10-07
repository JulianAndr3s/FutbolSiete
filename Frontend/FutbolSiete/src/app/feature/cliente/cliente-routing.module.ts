import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClienteComponent } from './cliente.component';
import { CrearClienteComponent } from './crear-cliente/crear-cliente.component';


const routes: Routes = [
  {
    path: '',
    component: ClienteComponent,
  },
  {
    path: 'crear-cliente',
    component: CrearClienteComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClienteRoutingModule { }