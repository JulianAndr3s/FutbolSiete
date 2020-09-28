package com.ceiba.adn.futbolsiete.dominio.excepcion;

public class ExcepcionObligatorio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionObligatorio(String message) {
        super(message);
    }

}
