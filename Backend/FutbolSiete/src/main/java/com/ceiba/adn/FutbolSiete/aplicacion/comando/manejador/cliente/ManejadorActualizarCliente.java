package com.ceiba.adn.FutbolSiete.aplicacion.comando.manejador.cliente;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioActualizarCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCliente {

    private final ServicioActualizarCliente servicioActualizarCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorActualizarCliente(ServicioActualizarCliente servicioActualizarCliente, FabricaCliente fabricaCliente) {
        this.servicioActualizarCliente = servicioActualizarCliente;
        this.fabricaCliente = fabricaCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = fabricaCliente.crear(comandoCliente);
        servicioActualizarCliente.ejecutar(cliente);
    }

}
