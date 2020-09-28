package com.ceiba.adn.FutbolSiete.dominio.servicios.cancha;

import com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioEliminarCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioEliminarCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Long id){
        repositorioCancha.eliminarCancha(id);
    }

}
