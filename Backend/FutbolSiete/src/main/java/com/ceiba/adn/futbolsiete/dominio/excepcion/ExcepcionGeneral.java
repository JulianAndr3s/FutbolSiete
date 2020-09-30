package com.ceiba.adn.futbolsiete.dominio.excepcion;

public class ExcepcionGeneral extends RuntimeException{

    public static final String NO_RESERVAR_LOS_LUNES = "No se puede reservar la cancha los lunes";

    private static final long serialVersionUID = 1L;

    public ExcepcionGeneral(String message) {
        super(message);
    }

}
