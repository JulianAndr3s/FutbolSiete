package com.ceiba.adn.futbolsiete.dominio.modelo;

import com.ceiba.adn.futbolsiete.dominio.validaciones.ValidarArgumento;

import java.time.LocalDateTime;

public class Reserva {

    private static final String SE_DEBE_INGRESAR_LA_FECHA = "Se debe ingresar la fecha para la reserva";
    private static final String SE_DEBE_INGRESAR_EL_PAGO = "Se debe ingresar un pago para la reserva";
    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;
    private Cancha cancha;
    private Long pagoTotal;

    public Reserva(Long id, Cliente cliente, LocalDateTime fecha, Cancha cancha, Long pagoTotal) {

        ValidarArgumento.validarObligatorio(fecha, SE_DEBE_INGRESAR_LA_FECHA);
        ValidarArgumento.validarObligatorio(pagoTotal, SE_DEBE_INGRESAR_EL_PAGO);
        
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.cancha = cancha;
        this.pagoTotal = pagoTotal;
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
