package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.futbolsiete.dominio.validaciones.ValidarLogicaNegocio;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;
    private ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();

    public ServicioCrearReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public void ejecutar(Reserva reserva) {
        validarLogicaNegocio.fechaEsValida(reserva.getFecha());
        Long precio = validarLogicaNegocio.calcularPrecio(reserva.getFecha(), reserva.getPagoTotal());
        Long precioFinal = validarLogicaNegocio.calcularDescuento(reserva.getFecha(), precio);

        reserva.setPagoTotal(precioFinal);
        this.repositorioReserva.crearReserva(reserva);
    }

}
