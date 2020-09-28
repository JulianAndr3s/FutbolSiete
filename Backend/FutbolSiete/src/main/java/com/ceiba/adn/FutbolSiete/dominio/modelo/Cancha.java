package com.ceiba.adn.FutbolSiete.dominio.modelo;

public class Cancha {

    private Long id;
    private String ubicacion;
    private Long cantidadJugadores;
    private Long valorCancha;

    public Cancha(Long id, String ubicacion, Long cantidadJugadores, Long valorCancha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.cantidadJugadores = cantidadJugadores;
        this.valorCancha = valorCancha;
    }

    public Cancha() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Long getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(Long cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public Long getValorCancha() {
        return valorCancha;
    }

    public void setValorCancha(Long valorCancha) {
        this.valorCancha = valorCancha;
    }
}
