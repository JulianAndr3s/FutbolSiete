package com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.reserva;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.futbolsiete.aplicacion.comando.fabrica.FabricaReserva;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioCrearReserva;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearReserva {

    private final ServicioCrearReserva servicioCrearReserva;
    private final FabricaReserva fabricaReserva;

    public ManejadorCrearReserva(ServicioCrearReserva servicioCrearReserva, FabricaReserva fabricaReserva) {
        this.servicioCrearReserva = servicioCrearReserva;
        this.fabricaReserva = fabricaReserva;
    }

    public void ejecutar(ComandoReserva comandoReserva){
        Reserva reserva = this.fabricaReserva.crear(comandoReserva);
        servicioCrearReserva.ejecutar(reserva);
    }
}
