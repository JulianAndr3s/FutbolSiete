package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;

    public ServicioCrearReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public void ejecutar(Reserva reserva) {
        this.repositorioReserva.crearReserva(reserva);
    }

}
