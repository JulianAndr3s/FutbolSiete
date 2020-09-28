package com.ceiba.adn.futbolsiete.aplicacion.comando.fabrica;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import org.springframework.stereotype.Component;

@Component
public class FabricaCancha {

    public Cancha crear(ComandoCancha comandoCancha){
        return new Cancha(comandoCancha.getId(), comandoCancha.getUbicacion(), comandoCancha.getCantidadJugadores(), comandoCancha.getValorCancha());
    }

}
