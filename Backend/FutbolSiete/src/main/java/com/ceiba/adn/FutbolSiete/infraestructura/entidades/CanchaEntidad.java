package com.ceiba.adn.FutbolSiete.infraestructura.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "cancha")
public class CanchaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cancha")
    private Long id;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "cantidad_jugadores")
    private Long cantidadJugadores;
    @Column(name = "valor_cancha")
    private Long valorCancha;

    public CanchaEntidad(Long id, String ubicacion, Long cantidadJugadores, Long valorCancha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.cantidadJugadores = cantidadJugadores;
        this.valorCancha = valorCancha;
    }

    public CanchaEntidad() {
    }
}
