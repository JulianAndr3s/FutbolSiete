package com.ceiba.adn.futbolsiete.aplicacion.comando.fabrica;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import org.springframework.stereotype.Component;

@Component
public class FabricaReserva {

    public Reserva crear(ComandoReserva comandoReserva){
        return new Reserva(comandoReserva.getId(), comandoReserva.getCliente(), comandoReserva.getFecha(),
                comandoReserva.getCancha(), comandoReserva.getPagoTotal());
    }

}
