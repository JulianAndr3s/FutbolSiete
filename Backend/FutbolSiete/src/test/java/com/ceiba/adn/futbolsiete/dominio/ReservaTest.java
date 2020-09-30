package com.ceiba.adn.futbolsiete.dominio;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReservaTest {

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearReserva() {
        // Arrange
        Reserva reserva = new ReservaTestDataBuilder().build();

        // Act - Assert
        Assert.assertNotNull(reserva);
    }

    @Test
    public void validarIngresoFecha() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new ReservaTestDataBuilder().conFecha(null).build();
                }, "Se debe ingresar la fecha para la reserva"
        );
    }

    @Test
    public void validarIngresoPrecio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new ReservaTestDataBuilder().conPago(null).build();
                }, "Se debe ingresar un pago para la reserva"
        );
    }

}
