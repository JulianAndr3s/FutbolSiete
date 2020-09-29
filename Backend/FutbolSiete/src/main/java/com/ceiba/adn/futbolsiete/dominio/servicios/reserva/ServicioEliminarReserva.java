package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioEliminarReserva {

    private RepositorioReserva repositorioReserva;

    public ServicioEliminarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public void ejecutar(Long id) {
        this.repositorioReserva.eliminarReserva(id);
    }
}
