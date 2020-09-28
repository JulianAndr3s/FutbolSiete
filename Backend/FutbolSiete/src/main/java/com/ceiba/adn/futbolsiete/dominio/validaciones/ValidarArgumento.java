package com.ceiba.adn.futbolsiete.dominio.validaciones;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionValorVacio;

public class ValidarArgumento {

    public ValidarArgumento() {
    }

    public static void validarObligatorio(Object valor, String mensaje){
        if (valor == null) {
            throw new ExcepcionObligatorio(mensaje);
        }
    }

    public static void validarNoVacio(String valor, String mensaje) {
        if (valor.trim().isEmpty()) {
            throw new ExcepcionValorVacio(mensaje);
        }
    }
}
