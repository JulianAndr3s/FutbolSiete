package com.ceiba.adn.FutbolSiete.dominio.modelo;

import com.ceiba.adn.FutbolSiete.dominio.validaciones.ValidarArgumento;

public class Cancha {

    private static final String SE_DEBE_INGRESAR_LA_UBICACION_DE_LA_CANCHA = "Se debe ingresar la ubicacion de la cancha";
    private static final String SE_DEBE_INGRESAR_CANTIDAD_DE_JUGADORES = "Se debe ingresar la cantidad de jugadores";
    private static final String SE_DEBE_INGRESAR_EL_VALOR_DE_LA_CANCHA = "Se debe ingresar el valor de la cancha";

    private Long id;
    private String ubicacion;
    private Long cantidadJugadores;
    private Long valorCancha;

    public Cancha(Long id, String ubicacion, Long cantidadJugadores, Long valorCancha) {

        ValidarArgumento.validarObligatorio(ubicacion, SE_DEBE_INGRESAR_LA_UBICACION_DE_LA_CANCHA);
        ValidarArgumento.validarNoVacio(ubicacion, SE_DEBE_INGRESAR_LA_UBICACION_DE_LA_CANCHA);

        ValidarArgumento.validarObligatorio(cantidadJugadores, SE_DEBE_INGRESAR_CANTIDAD_DE_JUGADORES);
        ValidarArgumento.validarObligatorio(valorCancha, SE_DEBE_INGRESAR_EL_VALOR_DE_LA_CANCHA);

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
