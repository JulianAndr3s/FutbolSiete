package com.ceiba.adn.futbolsiete.dominio.excepcion;

public class ExcepcionGeneral extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ExcepcionGeneral(String message) {
        super(message);
    }

}
