package com.ceiba.adn.futbolsiete.dominio.servicios.cliente;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioActualizarClienteTest {

    private static final String EL_CLIENTE_NO_YA_EXISTE = "El cliente que vas actualizar no existe";
    public ServicioActualizarCliente servicioActualizarCliente;
    public RepositorioCliente repositorioCliente;

    @Test
    public void errorAlActualizarClienteTest(){

        // Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioActualizarCliente = new ServicioActualizarCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();


        // Act - Assert
        try {
            servicioActualizarCliente.ejecutar(cliente);
        }
        catch (ExcepcionGeneral e){
            Assertions.assertEquals(EL_CLIENTE_NO_YA_EXISTE, e.getMessage());
        }
    }

}
