package com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cancha;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.futbolsiete.aplicacion.comando.fabrica.FabricaCancha;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.servicios.cancha.ServicioActualizarCancha;
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
