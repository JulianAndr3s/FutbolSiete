package com.ceiba.adn.futbolsiete.dominio.servicios.cliente;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearClienteTest {

    private static final String EL_CLIENTE_YA_EXISTE = "El cliente que intentas agregar ya existe";

    public ServicioCrearCliente servicioCrearCliente;
    public RepositorioCliente repositorioCliente;

    @Test
    public void crearClienteTest(){
        // Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();

        // Act
        servicioCrearCliente.ejecutar(cliente);

        // Assert
        Assertions.assertEquals(cliente.getCedula(), "1036402");
    }

    @Test
    public void crearClienteRepetidoTest(){
        // Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();
        servicioCrearCliente.ejecutar(cliente);
        Cliente clienteDos = new ClienteTestDataBuilder().build();

        // Act - Assert

        try {
            servicioCrearCliente.ejecutar(clienteDos);
        }
        catch (ExcepcionGeneral e){
            Assertions.assertEquals(EL_CLIENTE_YA_EXISTE, e.getMessage());
        }
    }
}
