import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CanchaComponent } from './cancha.component';
import { CrearCanchaComponent } from './crear-cancha/crear-cancha.component';
import { CanchaRoutingModule } from './cancha-routing.module';

@NgModule({
  declarations: [CanchaComponent, CrearCanchaComponent],
  imports: [ CommonModule, 
    CanchaRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    ]
})
export class CanchaModule {}