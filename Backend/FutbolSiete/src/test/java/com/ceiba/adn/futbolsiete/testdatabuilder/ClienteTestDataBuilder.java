package com.ceiba.adn.futbolsiete.testdatabuilder;

import com.ceiba.adn.futbolsiete.dominio.modelo.Cliente;

public class ClienteTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String cedula;

    public ClienteTestDataBuilder() {
        this.id = 10L;
        this.nombre = "Julian";
        this.apellido = "Botero";
        this.telefono = "5666804";
        this.correo = "julian@test.com";
        this.cedula = "1036402";
    }

    public ClienteTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ClienteTestDataBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public ClienteTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public ClienteTestDataBuilder conTelefono(String telefono){
        this.telefono = telefono;
        return this;
    }

    public ClienteTestDataBuilder conCedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public Cliente build(){
        return new Cliente(id, nombre, apellido, telefono, correo, cedula);
    }
}
