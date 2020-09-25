package com.ceiba.adn.FutbolSiete.infraestructura.configuracion;

import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioActualizarCliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioEliminarCliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioListarClientes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioCliente {

    @Bean
    public ServicioCrearCliente servicioCrearCliente(RepositorioCliente repositorioCliente){
        return new ServicioCrearCliente(repositorioCliente);
    }

    @Bean
    public ServicioEliminarCliente servicioEliminarCliente(RepositorioCliente repositorioCliente){
        return new ServicioEliminarCliente(repositorioCliente);
    }

    @Bean
    public ServicioActualizarCliente servicioActualizarCliente(RepositorioCliente repositorioCliente){
        return new ServicioActualizarCliente(repositorioCliente);
    }

    @Bean
    public ServicioListarClientes servicioListarClientes(RepositorioCliente repositorioCliente){
        return new ServicioListarClientes(repositorioCliente);
    }

}
