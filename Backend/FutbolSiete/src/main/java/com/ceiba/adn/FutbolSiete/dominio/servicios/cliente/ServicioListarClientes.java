package com.ceiba.adn.FutbolSiete.dominio.servicios.cliente;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;

import java.util.List;

public class ServicioListarClientes {

    private RepositorioCliente repositorioCliente;

    public ServicioListarClientes(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public List<Cliente> ejecutar() {
        return this.repositorioCliente.listarClientes();
    }

}
