package com.ceiba.adn.futbolsiete.infraestructura.adaptador.repositorio;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.futbolsiete.infraestructura.configuracion.convertidor.ConvertirCliente;
import com.ceiba.adn.futbolsiete.infraestructura.entidades.ClienteEntidad;
import com.ceiba.adn.futbolsiete.infraestructura.repositoriojpa.RepositorioClienteJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void eliminarCliente(Long id) {
        repositorioClienteJpa.deleteById(id);
    }

    @Override
    public List<Cliente> listarClientes() {
        List<ClienteEntidad> listaClienteEntidad = repositorioClienteJpa.findAll();
        List<Cliente> listaCliente= new ArrayList<>();
        return convertirCliente.convertirListaClienteEntidadAListaCliente(listaClienteEntidad, listaCliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        ClienteEntidad clienteEntidadActualizar = convertirCliente.convertirDominioPorEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidadActualizar);
    }

    @Override
    public Cliente buscarPorCedula(String cedula) {
        ClienteEntidad clienteEntidad = repositorioClienteJpa.findByCedula(cedula);
        return (clienteEntidad == null ? null : convertirCliente.convertirEntidadPorDominio(clienteEntidad));
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        String cedula = cliente.getCedula();
        return (repositorioClienteJpa.findByCedula(cedula)) != null;
    }
}
