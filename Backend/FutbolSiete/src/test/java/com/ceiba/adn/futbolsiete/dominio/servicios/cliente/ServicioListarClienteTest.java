package com.ceiba.adn.futbolsiete.dominio.servicios.cliente;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarClienteTest {

    public ServicioListarClientes servicioListarClientes;
    public RepositorioCliente repositorioCliente;

    @Test
    public void listarCanchasTest(){
        // Arrange
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new ClienteTestDataBuilder().build();
        clientes.add(cliente);

        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioListarClientes = new ServicioListarClientes(repositorioCliente);
        Mockito.when(servicioListarClientes.ejecutar()).thenReturn(clientes);

        // Act
        List<Cliente> clientesServicio = servicioListarClientes.ejecutar();

        // Assert
        Assertions.assertEquals(clientesServicio.get(0).getNombre(), "Julian");
        Assertions.assertEquals(clientesServicio.get(0).getId(), 10L);
    }

}
