package com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente) {
        return new Cliente(comandoCliente.getId(), comandoCliente.getNombre(), comandoCliente.getApellido(),
                comandoCliente.getTelefono(), comandoCliente.getCorreo(), comandoCliente.getCedula());
    }
}
