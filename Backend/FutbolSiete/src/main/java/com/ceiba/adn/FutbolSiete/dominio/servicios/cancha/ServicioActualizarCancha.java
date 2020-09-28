package com.ceiba.adn.FutbolSiete.dominio.servicios.cancha;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioActualizarCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioActualizarCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Cancha cancha){
        repositorioCancha.crearCancha(cancha);
    }
}
