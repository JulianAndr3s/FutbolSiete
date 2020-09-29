package com.ceiba.adn.futbolsiete.infraestructura.configuracion.convertidor;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.infraestructura.entidades.ReservaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirReserva {

    private ModelMapper modelMapper = new ModelMapper();

    public ReservaEntidad convertirDominioPorEntidad(Reserva reserva) {
        return modelMapper.map(reserva, ReservaEntidad.class);
    }

    public List<Reserva> convertirListaReservaEntidadAListaReserva(List<ReservaEntidad> listaReservaEntidad, List<Reserva> listaReserva){
        for(ReservaEntidad reservaEntidad: listaReservaEntidad) {
            Reserva reserva = modelMapper.map(reservaEntidad, Reserva.class);
            listaReserva.add(reserva);
        }
        return listaReserva;
    }

}
