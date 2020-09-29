package com.ceiba.adn.futbolsiete.infraestructura.repositoriojpa;

import com.ceiba.adn.futbolsiete.infraestructura.entidades.ReservaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioReservaJpa extends JpaRepository<ReservaEntidad, Serializable> {

}
