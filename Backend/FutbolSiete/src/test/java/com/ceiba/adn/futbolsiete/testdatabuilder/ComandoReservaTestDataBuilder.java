package com.ceiba.adn.futbolsiete.testdatabuilder;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;

import java.time.LocalDateTime;

public class ComandoReservaTestDataBuilder {

    private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
    private static final Cancha CANCHA = new CanchaTestDataBuilder().build();

    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;
    private Cancha cancha;
    private Long pagoTotal;

    public ComandoReservaTestDataBuilder() {
        this.id = 1L;
        this.cliente = CLIENTE;
        this.fecha = LocalDateTime.of(2020,10,1,11,30);
        this.cancha = CANCHA;
        this.pagoTotal = 150000L;
    }

    public ComandoReserva build(){
        return new ComandoReserva(id, cliente, fecha, cancha, pagoTotal);
    }
}
