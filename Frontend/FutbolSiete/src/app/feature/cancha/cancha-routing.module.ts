import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CrearCanchaComponent } from './crear-cancha/crear-cancha.component';
import { CanchaComponent } from './cancha.component';


const routes: Routes = [
  {
    path: '',
    component: CanchaComponent,
  },
  {
    path: 'crear-cancha',
    component: CrearCanchaComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CanchaRoutingModule { }