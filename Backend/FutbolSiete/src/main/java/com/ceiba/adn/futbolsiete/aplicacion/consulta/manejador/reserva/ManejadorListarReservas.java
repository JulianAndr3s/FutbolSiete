package com.ceiba.adn.futbolsiete.aplicacion.consulta.manejador.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioListarReserva;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarReservas {

    private final ServicioListarReserva servicioListarReserva;

    public ManejadorListarReservas(ServicioListarReserva servicioListarReserva) {
        this.servicioListarReserva = servicioListarReserva;
    }

    public List<Reserva> ejecutar() {
        return this.servicioListarReserva.ejecutar();
    }
}
