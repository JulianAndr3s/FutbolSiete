package com.ceiba.adn.FutbolSiete.infraestructura.configuracion.convertidor;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.infraestructura.entidades.CanchaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirCancha {

    private ModelMapper modelMapper = new ModelMapper();

    public CanchaEntidad convertirDominioPorEntidad(Cancha cancha) {
        return modelMapper.map(cancha, CanchaEntidad.class);
    }

    public List<Cancha> convertirListaCanchaEntidadAListaCancha(List<CanchaEntidad> listaCanchaEntidad, List<Cancha> listaCancha){
        for(CanchaEntidad canchaEntidad: listaCanchaEntidad) {
            Cancha cancha = modelMapper.map(canchaEntidad, Cancha.class);
            listaCancha.add(cancha);
        }
        return listaCancha;
    }

}
