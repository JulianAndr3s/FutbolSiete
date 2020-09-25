package com.ceiba.adn.FutbolSiete.dominio.servicios.cliente;

import com.ceiba.adn.FutbolSiete.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {

    private static final String EL_CLIENTE_YA_EXISTE = "El cliente que intentas agregar ya existe";

    private RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){

        if (repositorioCliente.existeCliente(cliente)){
            throw new ExcepcionGeneral(EL_CLIENTE_YA_EXISTE);
        }
        else {
            this.repositorioCliente.crearCliente(cliente);
        }
    }
}
