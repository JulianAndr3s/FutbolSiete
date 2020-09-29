package com.ceiba.adn.futbolsiete.infraestructura.adaptador.repositorio;

import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.adn.futbolsiete.infraestructura.configuracion.convertidor.ConvertirReserva;
import com.ceiba.adn.futbolsiete.infraestructura.entidades.ReservaEntidad;
import com.ceiba.adn.futbolsiete.infraestructura.repositoriojpa.RepositorioReservaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioReservaPostgres implements RepositorioReserva {

    private RepositorioReservaJpa repositorioReservaJpa;
    private ConvertirReserva convertirReserva;

    public RepositorioReservaPostgres(RepositorioReservaJpa repositorioReservaJpa, ConvertirReserva convertirReserva) {
        this.repositorioReservaJpa = repositorioReservaJpa;
        this.convertirReserva = convertirReserva;
    }

    @Override
    public void crearReserva(Reserva reserva) {
        ReservaEntidad reservaEntidad = convertirReserva.convertirDominioPorEntidad(reserva);
        repositorioReservaJpa.save(reservaEntidad);
    }

    @Override
    public void eliminarReserva(Long id) {
        repositorioReservaJpa.deleteById(id);
    }

    @Override
    public List<Reserva> listarReservas() {
        List<ReservaEntidad> listaReservaEntidad = repositorioReservaJpa.findAll();
        List<Reserva> listaReserva= new ArrayList<>();
        return convertirReserva.convertirListaReservaEntidadAListaReserva(listaReservaEntidad, listaReserva);
    }
}
