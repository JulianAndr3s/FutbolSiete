package com.ceiba.adn.futbolsiete.dominio.servicios.reserva;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.cliente.ServicioListarClientes;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.adn.futbolsiete.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarReservaTest {

    public ServicioListarReserva servicioListarReserva;
    public RepositorioReserva repositorioReserva;

    @Test
    public void listarCanchasTest(){
        // Arrange
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new ReservaTestDataBuilder().build();
        reservas.add(reserva);

        repositorioReserva = Mockito.mock(RepositorioReserva.class);
        servicioListarReserva = new ServicioListarReserva(repositorioReserva);
        Mockito.when(servicioListarReserva.ejecutar()).thenReturn(reservas);

        // Act
        List<Reserva> reservasLista = servicioListarReserva.ejecutar();

        // Assert
        Assertions.assertEquals(reservasLista.get(0).getPagoTotal(), 150000L );
        Assertions.assertEquals(reservasLista.get(0).getCliente().getNombre(), "Julian");
    }
}
