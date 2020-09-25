package com.ceiba.adn.FutbolSiete.infraestructura.adaptador.repositorio;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.FutbolSiete.infraestructura.configuracion.convertidor.ConvertirCliente;
import com.ceiba.adn.FutbolSiete.infraestructura.entidades.ClienteEntidad;
import com.ceiba.adn.FutbolSiete.infraestructura.repositorioJpa.RepositorioClienteJpa;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioClientePostgres implements RepositorioCliente {

    private RepositorioClienteJpa repositorioClienteJpa;
    private ConvertirCliente convertirCliente;

    public RepositorioClientePostgres(RepositorioClienteJpa repositorioClienteJpa, ConvertirCliente convertirCliente) {
        this.repositorioClienteJpa = repositorioClienteJpa;
        this.convertirCliente = convertirCliente;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        ClienteEntidad clienteEntidad = convertirCliente.convertirDominioPorEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidad);
    }
}
