package com.ceiba.adn.FutbolSiete.dominio.servicios.cancha;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;
import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;

import java.util.List;

public class ServicioListarCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioListarCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public List<Cancha> ejecutar() {
        return this.repositorioCancha.listarCanchas();
    }
}
