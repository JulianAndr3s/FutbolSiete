package com.ceiba.adn.FutbolSiete.dominio.servicios.cancha;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioCrearCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioCrearCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Cancha cancha) {
        this.repositorioCancha.crearCancha(cancha);
    }
}
