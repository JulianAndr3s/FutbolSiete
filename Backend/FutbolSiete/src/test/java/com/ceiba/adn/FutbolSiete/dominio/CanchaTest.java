package com.ceiba.adn.FutbolSiete.dominio;

import com.ceiba.adn.FutbolSiete.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.adn.FutbolSiete.dominio.excepcion.ExcepcionValorVacio;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.testdatabuilder.CanchaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CanchaTest {

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearCancha() {
        // Arrange
        Cancha cancha = new CanchaTestDataBuilder().build();

        // Act - Assert
        Assert.assertNotNull(cancha);
    }

    @Test
    public void validarIngresoUbicacion() {
        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new CanchaTestDataBuilder().conUbicacion(null).build();
                }, "Se debe ingresar la ubicacion de la cancha"
        );
    }

    @Test
    public void validarIngresoUbicacionVacio() {
        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new CanchaTestDataBuilder().conUbicacion(VALOR_VACIO).build();
                }, "Se debe ingresar la ubicacion de la cancha"
        );
    }

    @Test
    public void validarIngresoJugadores() {
        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new CanchaTestDataBuilder().conCantidadJugadores(null).build();
                }, "Se debe ingresar la cantidad de jugadores"
        );
    }

    @Test
    public void validarIngresoValorCancha() {
        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new CanchaTestDataBuilder().conValorCancha(null).build();
                }, "Se debe ingresar el valor de la cancha"
        );
    }

}
