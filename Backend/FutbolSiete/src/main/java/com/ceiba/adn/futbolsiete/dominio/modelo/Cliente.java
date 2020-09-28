package com.ceiba.adn.futbolsiete.dominio.modelo;

import com.ceiba.adn.futbolsiete.dominio.validaciones.ValidarArgumento;

public class Cliente {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PERSONA = "Se debe ingresar el nombre de la persona";
    private static final String SE_DEBE_INGRESAR_EL_APELLIDO_DE_LA_PERSONA = "Se debe ingresar el apellido de la persona";
    private static final String SE_DEBE_INGRESAR_EL_TELEFONO_DE_LA_PERSONA = "Se debe ingresar el telefono de la persona";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA_DE_LA_PERSONA = "Se debe ingresar la cedula de la persona";
    private static final String SE_DEBE_INGRESAR_CORREO_VALIDO_DE_LA_PERSONA = "Se debe ingresar un correo correcto";

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String cedula;

    public Cliente(Long id, String nombre, String apellido, String telefono, String correo, String cedula) {

        ValidarArgumento.validarObligatorio(nombre,SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PERSONA);
        ValidarArgumento.validarNoVacio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PERSONA);

        ValidarArgumento.validarObligatorio(apellido,SE_DEBE_INGRESAR_EL_APELLIDO_DE_LA_PERSONA);
        ValidarArgumento.validarNoVacio(apellido, SE_DEBE_INGRESAR_EL_APELLIDO_DE_LA_PERSONA);

        ValidarArgumento.validarObligatorio(telefono,SE_DEBE_INGRESAR_EL_TELEFONO_DE_LA_PERSONA);
        ValidarArgumento.validarNoVacio(telefono,SE_DEBE_INGRESAR_EL_TELEFONO_DE_LA_PERSONA);

        ValidarArgumento.validarNoVacio(correo, SE_DEBE_INGRESAR_CORREO_VALIDO_DE_LA_PERSONA);

        ValidarArgumento.validarObligatorio(cedula,SE_DEBE_INGRESAR_LA_CEDULA_DE_LA_PERSONA);
        ValidarArgumento.validarNoVacio(cedula,SE_DEBE_INGRESAR_LA_CEDULA_DE_LA_PERSONA);

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
