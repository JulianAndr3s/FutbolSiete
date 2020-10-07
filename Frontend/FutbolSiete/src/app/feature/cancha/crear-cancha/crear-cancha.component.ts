import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Cancha } from '../../../shared/modelos/cancha';
import { CanchaService } from '../../../shared/servicios/cancha.service';

@Component({
  selector: 'app-crear-cancha',
  templateUrl: './crear-cancha.component.html',
  styleUrls: ['./crear-cancha.component.scss']
})
export class CrearCanchaComponent implements OnInit {

  public cancha: Cancha = new Cancha();
  formularioCanchas: FormGroup;
  formularioEnviado = false;

  constructor(private canchaServicio: CanchaService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.iniciarFormulario();
  }

  iniciarFormulario(){
    this.formularioCanchas = this.formBuilder.group({
      ubicacion: ['', [Validators.required]],
      cantidadJugadores: ['', [Validators.required]],
      valorCancha: ['', [Validators.required]],
    });
  }

  get formulario() {
    return this.formularioCanchas.controls;
  }

  crearCancha(){
    this.cancha.ubicacion = this.formulario.ubicacion.value;
    this.cancha.cantidadJugadores = this.formulario.cantidadJugadores.value;
    this.cancha.valorCancha = this.formulario.valorCancha.value;

    this.formularioEnviado = true;

    
    if(this.formularioCanchas.valid){
      this.canchaServicio.insertarCancha(this.cancha).subscribe(
        _ => {
          this.router.navigate(['/canchas']);
        }
      );
    }
  }
}
