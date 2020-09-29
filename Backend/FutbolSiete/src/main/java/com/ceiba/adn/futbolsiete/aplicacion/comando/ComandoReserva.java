package com.ceiba.adn.futbolsiete.aplicacion.comando;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;

import java.time.LocalDate;

public class ComandoReserva {

    private Long id;
    private Cliente cliente;
    private LocalDate fecha;
    private Cancha cancha;
    private Long pagoTotal;

    public ComandoReserva(Long id, Cliente cliente, LocalDate fecha, Cancha cancha, Long pagoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.cancha = cancha;
        this.pagoTotal = pagoTotal;
    }

    public ComandoReserva() {
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Long getPagoTotal() {
        return pagoTotal;
    }
}
