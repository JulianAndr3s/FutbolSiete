package com.ceiba.adn.futbolsiete.aplicacion.comando.fabrica;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente) {
        return new Cliente(comandoCliente.getId(), comandoCliente.getNombre(), comandoCliente.getApellido(),
                comandoCliente.getTelefono(), comandoCliente.getCorreo(), comandoCliente.getCedula());
    }
}
