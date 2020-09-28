package com.ceiba.adn.FutbolSiete.dominio.puerto.repositorio;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cancha;

import java.util.List;

public interface RepositorioCancha {

    void crearCancha(Cancha cancha);
    void actualizarCancha(Cancha cancha);
    void eliminarCancha(Long id);
    List<Cancha> listarCanchas();

}
