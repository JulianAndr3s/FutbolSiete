package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.futbolsiete.testdatabuilder.CanchaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearCanchaTest {

    public ServicioCrearCancha servicioCrearCancha;
    public RepositorioCancha repositorioCancha;

    @Test
    public void crearCanchaTest(){
        // Arrange
        repositorioCancha = Mockito.mock(RepositorioCancha.class);
        servicioCrearCancha = new ServicioCrearCancha(repositorioCancha);
        Cancha cancha = new CanchaTestDataBuilder().build();

        // Act
        servicioCrearCancha.ejecutar(cancha);

        // Assert
        Assertions.assertEquals(cancha.getCantidadJugadores(), 8L);
    }

}
