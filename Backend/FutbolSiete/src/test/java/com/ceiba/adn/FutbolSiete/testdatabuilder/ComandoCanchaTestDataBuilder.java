package com.ceiba.adn.FutbolSiete.testdatabuilder;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCancha;

public class ComandoCanchaTestDataBuilder {

    private Long id;
    private String ubicacion;
    private Long cantidadJugadores;
    private Long valorCancha;

    public ComandoCanchaTestDataBuilder() {
        this.id = 2L;
        this.ubicacion = "Rionegro";
        this.cantidadJugadores = 11L;
        this.valorCancha = 60000L;
    }

    public ComandoCanchaTestDataBuilder conDatos(Long id, String ubicacion){
        this.id = id;
        this.ubicacion = ubicacion;
        return this;
    }

    public ComandoCancha build() {
        return new ComandoCancha(id, ubicacion, cantidadJugadores, valorCancha);
    }
}
