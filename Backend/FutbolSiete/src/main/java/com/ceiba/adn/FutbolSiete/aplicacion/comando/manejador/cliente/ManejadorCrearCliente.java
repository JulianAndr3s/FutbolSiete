package com.ceiba.adn.FutbolSiete.aplicacion.comando.manejador.cliente;

import com.ceiba.adn.FutbolSiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.FutbolSiete.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.adn.FutbolSiete.dominio.modelo.Cliente;
import com.ceiba.adn.FutbolSiete.dominio.servicios.cliente.ServicioCrearCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCliente {

    private final ServicioCrearCliente servicioCrearCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorCrearCliente(ServicioCrearCliente servicioCrearCliente, FabricaCliente fabricaCliente) {
        this.servicioCrearCliente = servicioCrearCliente;
        this.fabricaCliente = fabricaCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = fabricaCliente.crear(comandoCliente);
        servicioCrearCliente.ejecutar(cliente);
    }
}
