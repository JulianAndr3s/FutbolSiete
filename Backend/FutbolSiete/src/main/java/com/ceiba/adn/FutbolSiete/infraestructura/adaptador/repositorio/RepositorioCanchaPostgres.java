package com.ceiba.adn.FutbolSiete.infraestructura.adaptador.repositorio;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.FutbolSiete.infraestructura.configuracion.convertidor.ConvertirCancha;
import com.ceiba.adn.FutbolSiete.infraestructura.entidades.CanchaEntidad;
import com.ceiba.adn.FutbolSiete.infraestructura.repositorioJpa.RepositorioCanchaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioCanchaPostgres implements RepositorioCancha {

    private RepositorioCanchaJpa repositorioCanchaJpa;
    private ConvertirCancha convertirCancha;

    public RepositorioCanchaPostgres(RepositorioCanchaJpa repositorioCanchaJpa, ConvertirCancha convertirCancha) {
        this.repositorioCanchaJpa = repositorioCanchaJpa;
        this.convertirCancha = convertirCancha;
    }

    @Override
    public void crearCancha(Cancha cancha) {
        CanchaEntidad canchaEntidad = convertirCancha.convertirDominioPorEntidad(cancha);
        repositorioCanchaJpa.save(canchaEntidad);
    }

    @Override
    public void actualizarCancha(Cancha cancha) {
        CanchaEntidad canchaEntidad = convertirCancha.convertirDominioPorEntidad(cancha);
        repositorioCanchaJpa.save(canchaEntidad);
    }

    @Override
    public void eliminarCancha(Long id) {
        repositorioCanchaJpa.deleteById(id);
    }

    @Override
    public List<Cancha> listarCanchas() {
        List<CanchaEntidad> listaCanchaEntidad = repositorioCanchaJpa.findAll();
        List<Cancha> listaCancha= new ArrayList<>();
        return convertirCancha.convertirListaCanchaEntidadAListaCancha(listaCanchaEntidad, listaCancha);
    }
}
