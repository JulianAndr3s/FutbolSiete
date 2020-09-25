package com.ceiba.adn.FutbolSiete.aplicacion.consulta.manejador.cliente;

import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioListarClientes;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarClientes {

    private final ServicioListarClientes servicioListarCliente;

    public ManejadorListarClientes(ServicioListarClientes servicioListarCliente) {
        this.servicioListarCliente = servicioListarCliente;
    }

    public List<Cliente> ejecutar(){
        return this.servicioListarCliente.ejecutar();
    }

}
