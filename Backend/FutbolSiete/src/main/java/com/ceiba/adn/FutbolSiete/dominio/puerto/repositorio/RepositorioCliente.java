package com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;

import java.util.List;

public interface RepositorioCliente {

    void crearCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Long id);
    List<Cliente> listarClientes();
    Cliente buscarPorCedula(String cedula);
    boolean existeCliente(Cliente cliente);

}
