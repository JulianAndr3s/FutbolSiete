package com.ceiba.adn.futbolsiete.aplicacion.consulta.manejador.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.servicios.cancha.ServicioListarCancha;
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
