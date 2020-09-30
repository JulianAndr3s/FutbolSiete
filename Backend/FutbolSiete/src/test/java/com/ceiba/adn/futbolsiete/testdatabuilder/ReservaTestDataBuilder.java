package com.ceiba.adn.futbolsiete.testdatabuilder;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;

import java.time.LocalDateTime;

public class ReservaTestDataBuilder {

    private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
    private static final Cancha CANCHA = new CanchaTestDataBuilder().build();

    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;
    private Cancha cancha;
    private Long pagoTotal;

    public ReservaTestDataBuilder() {
        this.id = 1L;
        this.cliente = CLIENTE;
        this.fecha = LocalDateTime.of(2020,10,1,11,30);
        this.cancha = CANCHA;
        this.pagoTotal = 150000L;
    }

    public ReservaTestDataBuilder conFecha(LocalDateTime fecha){
        this.fecha = fecha;
        return this;
    }

    public ReservaTestDataBuilder conPago(Long pagoTotal){
        this.pagoTotal = pagoTotal;
        return this;
    }

    public Reserva build(){
        return new Reserva(id, cliente, fecha, cancha, pagoTotal);
    }
}
