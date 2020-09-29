package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;

import java.util.List;

public class ServicioListarReserva {

    private RepositorioReserva repositorioReserva;

    public ServicioListarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public List<Reserva> ejecutar() {
        return this.repositorioReserva.listarReservas();
    }
}
