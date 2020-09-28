package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioCrearCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioCrearCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Cancha cancha) {
        this.repositorioCancha.crearCancha(cancha);
    }
}
