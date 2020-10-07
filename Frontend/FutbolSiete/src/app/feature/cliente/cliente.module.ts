import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ClienteRoutingModule } from './cliente-routing.module';
import { CrearClienteComponent } from './crear-cliente/crear-cliente.component';
import { ClienteComponent } from './cliente.component';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [ClienteComponent, CrearClienteComponent],
  imports: [ CommonModule, 
    ClienteRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    ]
})
export class ClienteModule {}