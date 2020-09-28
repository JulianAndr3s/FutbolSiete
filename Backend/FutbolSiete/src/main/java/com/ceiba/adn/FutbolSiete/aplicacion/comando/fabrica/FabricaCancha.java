package com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import org.springframework.stereotype.Component;

@Component
public class FabricaCancha {

    public Cancha crear(ComandoCancha comandoCancha){
        return new Cancha(comandoCancha.getId(), comandoCancha.getUbicacion(), comandoCancha.getCantidadJugadores(), comandoCancha.getValorCancha());
    }

}
