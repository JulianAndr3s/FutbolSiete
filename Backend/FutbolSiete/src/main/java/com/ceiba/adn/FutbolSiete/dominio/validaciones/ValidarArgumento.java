package com.ceiba.adn.FutbolSiete.dominio.validaciones;

import com.ceiba.adn.FutbolSiete.dominio.excepcion.ExcepcionObligatorio;

public class ValidarArgumento {

    public ValidarArgumento() {
    }

    public static void validarObligatorio(Object valor, String mensaje){
        if (valor == null) {
            throw new ExcepcionObligatorio(mensaje);
        }
    }
}
