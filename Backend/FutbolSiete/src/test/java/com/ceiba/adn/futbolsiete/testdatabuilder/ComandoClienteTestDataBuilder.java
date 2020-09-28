package com.ceiba.adn.futbolsiete.testdatabuilder;

import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCliente;

public class ComandoClienteTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String cedula;

    public ComandoClienteTestDataBuilder() {
        this.id = 10L;
        this.nombre = "Julian";
        this.apellido = "Botero";
        this.telefono = "5666804";
        this.correo = "julian@test.com";
        this.cedula = "1036402";
    }

    public ComandoClienteTestDataBuilder conCedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public ComandoClienteTestDataBuilder conDatos(String cedula, Long id){
        this.cedula = cedula;
        this.id = id;
        return this;
    }

    public ComandoCliente build(){
        return new ComandoCliente(id, nombre, apellido, telefono, correo, cedula);
    }
}
