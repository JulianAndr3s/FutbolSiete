package com.ceiba.adn.futbolsiete.dominio.modelo;

import java.time.LocalDateTime;

public class Reserva {

    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;
    private Cancha cancha;
    private Long pagoTotal;

    public Reserva(Long id, Cliente cliente, LocalDateTime fecha, Cancha cancha, Long pagoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.cancha = cancha;
        this.pagoTotal = pagoTotal;
    }

    public Reserva() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Long getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(Long pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
}
