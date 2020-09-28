package com.ceiba.adn.futbolsiete.dominio.servicios.cliente;

import com.ceiba.adn.futbolsiete.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioActualizarCliente {

    private static final String EL_CLIENTE_NO_EXISTE = "El cliente que vas actualizar no existe";
    private RepositorioCliente repositorioCliente;

    public ServicioActualizarCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente) {
        if(repositorioCliente.existeCliente(cliente)) {
            this.repositorioCliente.actualizarCliente(cliente);
        }
        else {
            throw new ExcepcionGeneral(EL_CLIENTE_NO_EXISTE);
        }
    }
}
