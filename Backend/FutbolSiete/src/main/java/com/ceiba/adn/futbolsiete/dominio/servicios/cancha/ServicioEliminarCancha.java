package com.ceiba.adn.futbolsiete.dominio.servicios.cancha;

import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;

public class ServicioEliminarCancha {

    private RepositorioCancha repositorioCancha;

    public ServicioEliminarCancha(RepositorioCancha repositorioCancha) {
        this.repositorioCancha = repositorioCancha;
    }

    public void ejecutar(Long id){
        repositorioCancha.eliminarCancha(id);
    }

}
