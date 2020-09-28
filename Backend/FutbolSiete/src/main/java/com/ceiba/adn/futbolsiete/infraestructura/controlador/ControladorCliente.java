package com.ceiba.adn.futbolsiete.infraestructura.controlador;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cliente.ManejadorActualizarCliente;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;
import com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cliente.ManejadorEliminarCliente;
import com.ceiba.adn.futbolsiete.aplicacion.consulta.manejador.cliente.ManejadorListarClientes;
import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;
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
@RequestMapping(value = "/cliente")
public class ControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;
    private final ManejadorListarClientes manejadorListarCliente;
    private final ManejadorActualizarCliente manejadorActualizarCliente;
    private final ManejadorEliminarCliente manejadorEliminarCliente;

    public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente,
                              ManejadorListarClientes manejadorListarCliente,
                              ManejadorActualizarCliente manejadorActualizarCliente,
                              ManejadorEliminarCliente manejadorEliminarCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
        this.manejadorListarCliente = manejadorListarCliente;
        this.manejadorActualizarCliente = manejadorActualizarCliente;
        this.manejadorEliminarCliente = manejadorEliminarCliente;
    }

    @PostMapping
    public void crearCliente(@RequestBody ComandoCliente comandoCliente) {
        this.manejadorCrearCliente.ejecutar(comandoCliente);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return this.manejadorListarCliente.ejecutar();
    }

    @PutMapping
    public void actualizarCliente(@RequestBody ComandoCliente comandoCliente) {
        this.manejadorActualizarCliente.ejecutar(comandoCliente);
    }

    @DeleteMapping(value = "/{cedula}")
    public void eliminarCliente(@PathVariable String cedula) {
        this.manejadorEliminarCliente.ejecutar(cedula);
    }
}
