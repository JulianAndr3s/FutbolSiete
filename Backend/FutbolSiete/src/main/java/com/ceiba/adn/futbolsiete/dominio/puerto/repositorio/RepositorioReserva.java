package com.ceiba.adn.futbolsiete.dominio.puerto.repositorio;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;

import java.util.List;

public interface RepositorioReserva {

    void crearReserva(Reserva reserva);
    void eliminarReserva(Long id);
    List<Reserva> listarReservas();

}
