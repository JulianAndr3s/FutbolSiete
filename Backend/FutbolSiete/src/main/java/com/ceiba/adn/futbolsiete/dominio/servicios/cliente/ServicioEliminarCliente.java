package com.ceiba.adn.futbolsiete.dominio.servicios.cliente;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioEliminarCliente (RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(String cedula) {
        Cliente cliente = repositorioCliente.buscarPorCedula(cedula);
        this.repositorioCliente.eliminarCliente(cliente.getId());
    }

}
