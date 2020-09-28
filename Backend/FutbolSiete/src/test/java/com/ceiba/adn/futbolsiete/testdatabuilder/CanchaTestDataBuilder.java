package com.ceiba.adn.futbolsiete.testdatabuilder;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;

public class CanchaTestDataBuilder {

    private Long id;
    private String ubicacion;
    private Long cantidadJugadores;
    private Long valorCancha;

    public CanchaTestDataBuilder() {
        this.id = 1L;
        this.ubicacion = "El Carmen de Viboral";
        this.cantidadJugadores = 8L;
        this.valorCancha = 68000L;
    }

    public CanchaTestDataBuilder conUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
        return this;
    }

    public CanchaTestDataBuilder conCantidadJugadores(Long cantidadJugadores){
        this.cantidadJugadores = cantidadJugadores;
        return this;
    }

    public CanchaTestDataBuilder conValorCancha(Long valorCancha){
        this.valorCancha = valorCancha;
        return this;
    }

    public Cancha build(){
        return new Cancha(id,ubicacion,cantidadJugadores,valorCancha);
    }

}
