package com.ceiba.adn.futbolsiete.dominio.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExcepcionObligatorio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionObligatorio(String message) {
        super(message);
    }

}
