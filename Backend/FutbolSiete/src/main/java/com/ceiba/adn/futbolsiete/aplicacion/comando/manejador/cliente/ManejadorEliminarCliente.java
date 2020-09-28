package com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cliente;

import com.ceiba.adn.futbolsiete.dominio.servicios.cliente.ServicioEliminarCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCliente {

    private final ServicioEliminarCliente servicioEliminarCliente;

    public ManejadorEliminarCliente(ServicioEliminarCliente servicioEliminarCliente) {
        this.servicioEliminarCliente = servicioEliminarCliente;
    }

    public void ejecutar(String cedula){
        servicioEliminarCliente.ejecutar(cedula);
    }
}
