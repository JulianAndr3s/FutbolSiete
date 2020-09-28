package com.ceiba.adn.FutbolSiete.infraestructura.configuracion;

import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioActualizarCancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioCrearCancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioEliminarCancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioListarCancha;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioCancha {

    @Bean
    public ServicioCrearCancha servicioCrearCancha(RepositorioCancha repositorioCancha){
        return new ServicioCrearCancha(repositorioCancha);
    }

    @Bean
    public ServicioActualizarCancha servicioActualizarCancha(RepositorioCancha repositorioCancha){
        return new ServicioActualizarCancha(repositorioCancha);
    }

    @Bean
    public ServicioEliminarCancha servicioEliminarCancha(RepositorioCancha repositorioCancha){
        return new ServicioEliminarCancha(repositorioCancha);
    }

    @Bean
    public ServicioListarCancha servicioListarCancha(RepositorioCancha repositorioCancha){
        return new ServicioListarCancha(repositorioCancha);
    }
}
