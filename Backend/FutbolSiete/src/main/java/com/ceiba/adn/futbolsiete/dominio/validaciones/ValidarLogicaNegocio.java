package com.ceiba.adn.futbolsiete.dominio.validaciones;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionGeneral;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.DAYS;

public class ValidarLogicaNegocio {

    public static final String DIA_QUE_NO_HAY_SERVICIO = "MONDAY";
    private static final String DOMINGO = "SUNDAY";
    private static final String SABADO = "SATURDAY";
    private static final Long VALOR_EXTRA = 110L;
    private static final Long DIAS_PARA_DESCUENTO = 9L;


    public Long calcularPrecio(LocalDateTime fechaReserva, Long precio) {
        String diaSemana = fechaReserva.getDayOfWeek().toString();

        if (diaSemana.equals(DOMINGO) || diaSemana.equals(SABADO)){
            return (precio * VALOR_EXTRA) / 100;
        }
        else {
            return precio;
        }
    }

    public void fechaEsValida(LocalDateTime fechaLanzamiento) {
        String diaSemana = fechaLanzamiento.getDayOfWeek().toString();
        if (diaSemana.equals(DIA_QUE_NO_HAY_SERVICIO)) {
            throw new ExcepcionGeneral(ExcepcionGeneral.NO_RESERVAR_LOS_LUNES);
        }
    }

    public Long calcularDescuento(LocalDateTime fechaReserva, Long precio) {
        LocalDateTime fechaActual = LocalDateTime.now();
        Long dias = DAYS.between(fechaActual, fechaReserva);
        
        if (dias >= DIAS_PARA_DESCUENTO){
            return (precio * 95) / 100;
        }
        else {
            return precio;
        }
    }

}
