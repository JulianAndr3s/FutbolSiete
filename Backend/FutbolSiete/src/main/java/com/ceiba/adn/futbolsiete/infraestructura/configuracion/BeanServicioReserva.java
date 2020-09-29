package com.ceiba.adn.futbolsiete.infraestructura.configuracion;

import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioCrearReserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioEliminarReserva;
import com.ceiba.adn.futbolsiete.dominio.servicios.reserva.ServicioListarReserva;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioReserva {

    @Bean
    public ServicioCrearReserva servicioCrearReserva(RepositorioReserva repositorioReserva){
        return new ServicioCrearReserva(repositorioReserva);
    }

    @Bean
    public ServicioEliminarReserva servicioEliminarReserva(RepositorioReserva repositorioReserva){
        return new ServicioEliminarReserva(repositorioReserva);
    }

    @Bean
    public ServicioListarReserva servicioListarReserva(RepositorioReserva repositorioReserva){
        return new ServicioListarReserva(repositorioReserva);
    }

}
