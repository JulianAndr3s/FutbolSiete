package com.ceiba.adn.futbolsiete.infraestructura.adaptador.repositorio;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.futbolsiete.infraestructura.configuracion.convertidor.ConvertirCancha;
import com.ceiba.adn.futbolsiete.infraestructura.entidades.CanchaEntidad;
import com.ceiba.adn.futbolsiete.infraestructura.repositoriojpa.RepositorioCanchaJpa;
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
