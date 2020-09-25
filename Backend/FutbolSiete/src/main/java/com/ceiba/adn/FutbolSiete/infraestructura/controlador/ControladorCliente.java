package com.ceiba.adn.FutbolSiete.infraestructura.controlador;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.FutbolSiete.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;

    public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
    }

    @PostMapping
    public void crearCliente(@RequestBody ComandoCliente comandoCliente) {
        this.manejadorCrearCliente.ejecutar(comandoCliente);
    }
}
