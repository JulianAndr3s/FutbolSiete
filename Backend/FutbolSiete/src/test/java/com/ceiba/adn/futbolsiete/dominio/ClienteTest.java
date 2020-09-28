package com.ceiba.adn.futbolsiete.dominio;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionValorVacio;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClienteTest {

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearCliente() {
        // Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();

        // Act - Assert
        Assert.assertNotNull(cliente);
    }

    @Test
    public void validarIngresoNombre() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                new ClienteTestDataBuilder().conNombre(null).build();
            }, "Se debe ingresar el nombre de la persona"
        );
    }

    @Test
    public void validarIngresoNombreVacio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new ClienteTestDataBuilder().conNombre(VALOR_VACIO).build();
                }, "Se debe ingresar el nombre de la persona"
        );
    }

    @Test
    public void validarIngresoApellido() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new ClienteTestDataBuilder().conApellido(null).build();
                }, "Se debe ingresar el apellido de la persona"
        );
    }

    @Test
    public void validarIngresoApellidoVacio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new ClienteTestDataBuilder().conApellido(VALOR_VACIO).build();
                }, "Se debe ingresar el apellido de la persona"
        );
    }

    @Test
    public void validarIngresoTelefono() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new ClienteTestDataBuilder().conTelefono(null).build();
                }, "Se debe ingresar el telefono de la persona"
        );
    }

    @Test
    public void validarIngresoTelefonoVacio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new ClienteTestDataBuilder().conTelefono(VALOR_VACIO).build();
                }, "Se debe ingresar el telefono de la persona"
        );
    }

    @Test
    public void validarIngresoCorreoVacio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new ClienteTestDataBuilder().conCorreo(VALOR_VACIO).build();
                }, "Se debe ingresar el correo de la persona"
        );
    }

    @Test
    public void validarIngresoCedula() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () -> {
                    new ClienteTestDataBuilder().conCedula(null).build();
                }, "Se debe ingresar la cedula de la persona"
        );
    }

    @Test
    public void validarIngresoCedulaVacio() {

        // Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, () -> {
                    new ClienteTestDataBuilder().conCedula(VALOR_VACIO).build();
                }, "Se debe ingresar la cedula de la persona"
        );
    }

}
