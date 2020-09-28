package com.ceiba.adn.FutbolSiete.aplicacion.comando;

public class ComandoCancha {

    private Long id;
    private String ubicacion;
    private Long cantidadJugadores;
    private Long valorCancha;

    public ComandoCancha(Long id, String ubicacion, Long cantidadJugadores, Long valorCancha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.cantidadJugadores = cantidadJugadores;
        this.valorCancha = valorCancha;
    }

    public ComandoCancha() {
    }

    public Long getId() {
        return id;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Long getCantidadJugadores() {
        return cantidadJugadores;
    }

    public Long getValorCancha() {
        return valorCancha;
    }
}
