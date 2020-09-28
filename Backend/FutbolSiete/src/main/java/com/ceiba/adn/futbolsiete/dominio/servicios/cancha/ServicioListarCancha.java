package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;

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
