package com.ceiba.adn.futbolsiete.infraestructura.controlador;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.reserva.ManejadorCrearReserva;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.reserva.ManejadorEliminarReserva;
import com.ceiba.adn.futbolsiete.aplicacion.consulta.manejador.reserva.ManejadorListarReservas;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/reserva")
public class ControladorReserva {

    private final ManejadorCrearReserva manejadorCrearReserva;
    private final ManejadorEliminarReserva manejadorEliminarReserva;
    private final ManejadorListarReservas manejadorListarReservas;

    public ControladorReserva(ManejadorCrearReserva manejadorCrearReserva, ManejadorEliminarReserva manejadorEliminarReserva, ManejadorListarReservas manejadorListarReservas) {
        this.manejadorCrearReserva = manejadorCrearReserva;
        this.manejadorEliminarReserva = manejadorEliminarReserva;
        this.manejadorListarReservas = manejadorListarReservas;
    }

    @PostMapping
    public void crearReserva(@RequestBody ComandoReserva comandoReserva) {
        this.manejadorCrearReserva.ejecutar(comandoReserva);
    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return this.manejadorListarReservas.ejecutar();
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        this.manejadorEliminarReserva.ejecutar(id);
    }
}
