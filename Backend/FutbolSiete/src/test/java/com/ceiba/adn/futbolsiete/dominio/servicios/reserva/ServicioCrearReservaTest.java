package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.adn.futbolsiete.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearReservaTest {

    public ServicioCrearReserva servicioCrearReserva;
    public RepositorioReserva repositorioReserva;

    @Test
    public void crearClienteTest(){
        // Arrange
        repositorioReserva = Mockito.mock(RepositorioReserva.class);
        servicioCrearReserva = new ServicioCrearReserva(repositorioReserva);
        Reserva reserva = new ReservaTestDataBuilder().build();

        // Act
        servicioCrearReserva.ejecutar(reserva);

        // Assert
        Assertions.assertEquals(reserva.getPagoTotal(), 150000L);
    }

}
