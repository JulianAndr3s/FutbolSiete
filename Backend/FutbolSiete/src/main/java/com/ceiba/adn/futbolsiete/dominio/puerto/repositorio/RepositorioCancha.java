package com.ceiba.adn.futbolsiete.dominio.puerto.repositorio;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;

import java.util.List;

public interface RepositorioCancha {

    void crearCancha(Cancha cancha);
    void actualizarCancha(Cancha cancha);
    void eliminarCancha(Long id);
    List<Cancha> listarCanchas();

}
