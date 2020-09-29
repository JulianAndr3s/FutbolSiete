package com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.reserva;

import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioEliminarReserva;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarReserva {

    private final ServicioEliminarReserva servicioEliminarReserva;

    public ManejadorEliminarReserva(ServicioEliminarReserva servicioEliminarReserva) {
        this.servicioEliminarReserva = servicioEliminarReserva;
    }

    public void ejecutar(Long id){
        servicioEliminarReserva.ejecutar(id);
    }
}
