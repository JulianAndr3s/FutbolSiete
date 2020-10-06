package com.ceiba.adn.futbolsiete.dominio.validaciones;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionGeneral;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class ValidarLogicaNegocioTest {

    @Test
    public void calcularPrecioFinDeSemanaDomingo(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,3,11,30);
        Long precio = 25000L;

        // Act
        Long resultado = validarLogicaNegocio.calcularPrecio(fechaReserva, precio);

        // Assert
        Assertions.assertEquals(resultado, 27500L);
    }

    @Test
    public void calcularPrecioFinDeSemanaSabado(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,11,11,30);
        Long precio = 25000L;

        // Act
        Long resultado = validarLogicaNegocio.calcularPrecio(fechaReserva, precio);

        // Assert
        Assertions.assertEquals(resultado, 27500L);
    }

    @Test
    public void calcularPrecioSemana(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,1,11,30);
        Long precio = 35000L;

        // Act
        Long resultado = validarLogicaNegocio.calcularPrecio(fechaReserva, precio);

        // Assert
        Assertions.assertEquals(resultado, 35000L);
    }

    @Test
    public void calcularFechaInvalida(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,5,11,30);

        // Act - Assert
        Assertions.assertThrows(ExcepcionGeneral.class, () -> {
                    validarLogicaNegocio.fechaEsValida(fechaReserva);
                }, "No se puede reservar la cancha los lunes"
        );
    }

    @Test
    public void calcularFechaValida(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,6,11,30);

        // Act - Assert
        Assertions.assertTrue(fechaReserva.getDayOfWeek().toString() != "MONDAY" );
    }

    @Test
    public void calcularPrecioDescuento(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,22,11,30);
        Long precio = 25000L;

        // Act
        Long resultado = validarLogicaNegocio.calcularDescuento(fechaReserva, precio);

        // Assert
        Assertions.assertEquals(resultado, 23750L);
    }

    @Test
    public void calcularPrecioSinDescuento(){

        // Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2020,10,2,11,30);
        Long precio = 25000L;

        // Act
        Long resultado = validarLogicaNegocio.calcularDescuento(fechaReserva, precio);

        // Assert
        Assertions.assertEquals(resultado, 25000L);
    }
}
