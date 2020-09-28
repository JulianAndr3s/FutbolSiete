package com.ceiba.adn.futbolsiete.aplicacion.comando;

public class ComandoCliente {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String cedula;

    public ComandoCliente(Long id, String nombre, String apellido, String telefono, String correo, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
    }

    public ComandoCliente() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCedula() {
        return cedula;
    }
}
