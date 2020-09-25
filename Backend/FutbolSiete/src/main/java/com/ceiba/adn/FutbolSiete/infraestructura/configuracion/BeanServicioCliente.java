package com.ceiba.adn.FutbolSiete.infraestructura.configuracion;

import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioCrearCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioCliente {

    @Bean
    public ServicioCrearCliente servicioCrearCliente(RepositorioCliente repositorioCliente){
        return new ServicioCrearCliente(repositorioCliente);
    }

}
