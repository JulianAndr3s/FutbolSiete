import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ReservaRoutingModule } from './reserva-routing.module';
import { ReservaComponent } from './reserva.component';
import { CrearReservaComponent } from './crear-reserva/crear-reserva.component';

@NgModule({
  declarations: [ReservaComponent, CrearReservaComponent],
  imports: [ CommonModule, 
    ReservaRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    ]
})
export class ReservaModule {}