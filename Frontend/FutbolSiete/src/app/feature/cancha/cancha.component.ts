import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cancha } from 'src/app/shared/modelos/cancha';
import { CanchaService } from '../../shared/servicios/cancha.service';

@Component({
  selector: 'app-cancha',
  templateUrl: './cancha.component.html',
  styleUrls: ['./cancha.component.scss']
})
export class CanchaComponent implements OnInit {

  public canchas: Cancha[];
  public cancha: Cancha = new Cancha();
  public canchaActualizar: Cancha = new Cancha();
  public canchaSeleccionada: Cancha = new Cancha();

  formularioCanchas: FormGroup;
  formularioEnviado = false;

  constructor(private canchaServicio: CanchaService, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.listarCanchas();
    this.iniciarFormulario();
  }

  listarCanchas() {
    this.canchaServicio.listarCanchas().subscribe(
      cancha => {
        this.canchas = cancha;
      }
    );
  }

  iniciarFormulario(){
    this.formularioCanchas = this.formBuilder.group({
      ubicacion: [this.canchaSeleccionada.ubicacion, [Validators.required]],
      cantidadJugadores: [this.canchaSeleccionada.cantidadJugadores, [Validators.required]],
      valorCancha: [this.canchaSeleccionada.valorCancha, [Validators.required]],
    });
  }

  get formulario() {
    return this.formularioCanchas.controls;
  }

  mostrarModal(cancha: Cancha) {
    this.canchaSeleccionada = cancha;
    this.iniciarFormulario();
  }

  eliminarCancha(id: number) {
    this.canchaServicio.eliminarCancha(id).subscribe(
      _ => (
        this.canchas = this.canchas.filter(cancha => cancha !== this.canchaSeleccionada)
      )
    );
  }

  actualizarCancha() {
    this.canchaActualizar.id = this.canchaSeleccionada.id;
    this.canchaActualizar.ubicacion = this.formulario.ubicacion.value;
    this.canchaActualizar.cantidadJugadores = this.formulario.cantidadJugadores.value;
    this.canchaActualizar.valorCancha = this.formulario.valorCancha.value;
  
    this.formularioEnviado = true;
  
    this.canchaServicio.actualizarCancha(this.canchaActualizar).subscribe(
      _ => {
        this.listarCanchas();
      }
    );

    
  }

}
