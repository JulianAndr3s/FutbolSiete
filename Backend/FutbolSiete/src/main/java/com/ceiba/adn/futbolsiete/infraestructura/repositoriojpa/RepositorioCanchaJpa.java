package com.ceiba.adn.futbolsiete.infraestructura.repositoriojpa;

import com.ceiba.adn.futbolsiete.infraestructura.entidades.CanchaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioCanchaJpa  extends JpaRepository<CanchaEntidad, Serializable> {
}
