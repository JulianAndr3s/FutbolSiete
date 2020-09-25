package com.ceiba.adn.FutbolSiete.dominio.servicios.cliente;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){

        // Se hacen validaciones de existencia luego
        this.repositorioCliente.crearCliente(cliente);
    }
}
