package com.ceiba.adn.futbolsiete.infraestructura.repositorioJpa;

import com.ceiba.adn.futbolsiete.infraestructura.entidades.ClienteEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioClienteJpa extends JpaRepository<ClienteEntidad, Serializable> {

    ClienteEntidad findByCedula(String cedula);

}
