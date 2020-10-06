package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.futbolsiete.testdatabuilder.CanchaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarCanchaTest {

    public ServicioListarCancha servicioListarCancha;
    public RepositorioCancha repositorioCancha;

    @Test
    public void listarCanchasTest(){
        // Arrange
        List<Cancha> canchas = new ArrayList<>();
        Cancha cancha = new CanchaTestDataBuilder().build();
        canchas.add(cancha);

        repositorioCancha = Mockito.mock(RepositorioCancha.class);
        servicioListarCancha = new ServicioListarCancha(repositorioCancha);
        Mockito.when(servicioListarCancha.ejecutar()).thenReturn(canchas);

        // Act
        List<Cancha> canchasServicio = servicioListarCancha.ejecutar();

        // Assert
        Assertions.assertEquals(canchasServicio.get(0).getCantidadJugadores(), 8L);
        Assertions.assertEquals(canchasServicio.get(0).getUbicacion(), "El Carmen de Viboral");
    }

}
