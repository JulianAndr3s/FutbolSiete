package com.ceiba.adn.futbolsiete.infraestructura.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "reserva")
public class ReservaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private ClienteEntidad cliente;
    @Column(name = "fecha")
    private LocalDate fecha;
    @ManyToOne()
    @JoinColumn(name = "id_cancha")
    private CanchaEntidad cancha;
    @Column(name = "pago_total")
    private Long pagoTotal;

    public ReservaEntidad(Long id, ClienteEntidad cliente, LocalDate fecha, CanchaEntidad cancha, Long pagoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.cancha = cancha;
        this.pagoTotal = pagoTotal;
    }

    public ReservaEntidad() {
    }
}
