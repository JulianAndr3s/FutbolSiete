package com.ceiba.adn.FutbolSiete.aplicacion.consulta.manejador.cancha;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioListarCancha;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarCanchas {

    private final ServicioListarCancha servicioListarCancha;

    public ManejadorListarCanchas(ServicioListarCancha servicioListarCancha) {
        this.servicioListarCancha = servicioListarCancha;
    }

    public List<Cancha> ejecutar(){
        return this.servicioListarCancha.ejecutar();
    }
}
