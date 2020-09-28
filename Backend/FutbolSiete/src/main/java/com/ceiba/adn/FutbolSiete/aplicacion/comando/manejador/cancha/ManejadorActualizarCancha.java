package com.ceiba.adn.FutbolSiete.aplicacion.comando.manejador.cancha;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica.FabricaCancha;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioActualizarCancha;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCancha {

    private final ServicioActualizarCancha servicioActualizarCancha;
    private final FabricaCancha fabricaCancha;

    public ManejadorActualizarCancha(ServicioActualizarCancha servicioActualizarCancha, FabricaCancha fabricaCancha) {
        this.servicioActualizarCancha = servicioActualizarCancha;
        this.fabricaCancha = fabricaCancha;
    }

    public void ejecutar(ComandoCancha comandoCancha){
        Cancha cancha = fabricaCancha.crear(comandoCancha);
        servicioActualizarCancha.ejecutar(cancha);
    }
}
