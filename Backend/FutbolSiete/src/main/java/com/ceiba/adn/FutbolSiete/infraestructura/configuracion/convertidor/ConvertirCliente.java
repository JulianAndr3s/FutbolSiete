package com.ceiba.adn.FutbolSiete.infraestructura.configuracion.convertidor;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.infraestructura.entidades.ClienteEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertirCliente {

    private ModelMapper modelMapper = new ModelMapper();

    public ClienteEntidad convertirDominioPorEntidad(Cliente cliente) {
        return modelMapper.map(cliente, ClienteEntidad.class);
    }


}
