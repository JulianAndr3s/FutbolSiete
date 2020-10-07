import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './feature/home/home.component';

const routes: Routes = [

  {
    path: 'clientes',
    loadChildren: () =>
      import('./feature/cliente/cliente.module').then(mod => mod.ClienteModule)
  },

  {
    path: 'canchas',
    loadChildren: () =>
      import('./feature/cancha/cancha.module').then(mod => mod.CanchaModule)
  },

  {
    path: 'reservas',
    loadChildren: () =>
      import('./feature/reserva/reserva.module').then(mod => mod.ReservaModule)
  },

  {
    path: 'principal', 
    component: HomeComponent
  },

  {path: '**', pathMatch: 'full', redirectTo: 'principal'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
