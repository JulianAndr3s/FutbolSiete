package com.ceiba.adn.futbolsiete.infraestructura.configuracion.convertidor;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
import com.ceiba.adn.futbolsiete.infraestructura.entidades.ClienteEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirCliente {

    private ModelMapper modelMapper = new ModelMapper();

    public ClienteEntidad convertirDominioPorEntidad(Cliente cliente) {
        return modelMapper.map(cliente, ClienteEntidad.class);
    }

    public Cliente convertirEntidadPorDominio(ClienteEntidad clienteEntidad) {
        return modelMapper.map(clienteEntidad, Cliente.class);
    }

    public List<Cliente> convertirListaClienteEntidadAListaCliente(List<ClienteEntidad> listaClienteEntidad, List<Cliente> listaCliente){
        for(ClienteEntidad clienteEntidad: listaClienteEntidad) {
            Cliente cliente = modelMapper.map(clienteEntidad, Cliente.class);
            listaCliente.add(cliente);
        }
        return listaCliente;
    }

}
