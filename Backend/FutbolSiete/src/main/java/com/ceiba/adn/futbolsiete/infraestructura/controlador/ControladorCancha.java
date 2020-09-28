package com.ceiba.adn.futbolsiete.infraestructura.controlador;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cancha.ManejadorActualizarCancha;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cancha.ManejadorCrearCancha;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cancha.ManejadorEliminarCancha;
import com.ceiba.adn.futbolsiete.aplicacion.consulta.manejador.cancha.ManejadorListarCanchas;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cancha;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cancha")
public class ControladorCancha {

    private final ManejadorCrearCancha manejadorCrearCancha;
    private final ManejadorActualizarCancha manejadorActualizarCancha;
    private final ManejadorListarCanchas manejadorListarCanchas;
    private final ManejadorEliminarCancha manejadorEliminarCancha;

    public ControladorCancha(ManejadorCrearCancha manejadorCrearCancha,
                             ManejadorActualizarCancha manejadorActualizarCancha,
                             ManejadorListarCanchas manejadorListarCanchas,
                             ManejadorEliminarCancha manejadorEliminarCancha) {
        this.manejadorCrearCancha = manejadorCrearCancha;
        this.manejadorActualizarCancha = manejadorActualizarCancha;
        this.manejadorEliminarCancha = manejadorEliminarCancha;
        this.manejadorListarCanchas = manejadorListarCanchas;
    }

    @PostMapping
    public void crearCancha(@RequestBody ComandoCancha comandoCancha) {
        this.manejadorCrearCancha.ejecutar(comandoCancha);
    }

    @GetMapping
    public List<Cancha> listarCanchas() {
        return this.manejadorListarCanchas.ejecutar();
    }

    @PutMapping
    public void actualizarCancha(@RequestBody ComandoCancha comandoCancha) {
        this.manejadorActualizarCancha.ejecutar(comandoCancha);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarCancha(@PathVariable Long id) {
        this.manejadorEliminarCancha.ejecutar(id);
    }
}
