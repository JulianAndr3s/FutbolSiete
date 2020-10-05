import { Cancha } from './cancha';
import { Cliente } from './cliente';

export class Reserva {
    id: number;
    cliente = new Cliente();
    fecha: Date;
    cancha = new Cancha();
    pagoTotal: number;
}