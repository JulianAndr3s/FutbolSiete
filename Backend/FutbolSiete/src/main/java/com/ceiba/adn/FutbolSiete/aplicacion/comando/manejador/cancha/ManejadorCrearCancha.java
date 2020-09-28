package com.ceiba.adn.FutbolSiete.aplicacion.comando.manejador.cancha;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica.FabricaCancha;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cancha.ServicioCrearCancha;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCancha {

    private final ServicioCrearCancha servicioCrearCancha;
    private final FabricaCancha fabricaCancha;

    public ManejadorCrearCancha(ServicioCrearCancha servicioCrearCancha, FabricaCancha fabricaCancha) {
        this.servicioCrearCancha = servicioCrearCancha;
        this.fabricaCancha = fabricaCancha;
    }

    public void ejecutar(ComandoCancha comandoCancha){
        Cancha cancha = fabricaCancha.crear(comandoCancha);
        servicioCrearCancha.ejecutar(cancha);
    }
}
