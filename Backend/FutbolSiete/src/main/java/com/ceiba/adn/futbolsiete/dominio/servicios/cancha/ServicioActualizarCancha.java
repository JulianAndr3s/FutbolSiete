package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioActualizarCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioActualizarCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Cancha cancha){
        repositorioCancha.actualizarCancha(cancha);
    }
}
