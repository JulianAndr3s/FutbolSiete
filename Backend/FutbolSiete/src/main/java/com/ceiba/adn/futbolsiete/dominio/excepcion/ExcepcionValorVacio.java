package com.ceiba.adn.futbolsiete.dominio.excepcion;

public class ExcepcionValorVacio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionValorVacio(String message) {
        super(message);
    }

}
