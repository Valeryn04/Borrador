
package com.mycompany.ventanaagroclientes.modelos;

/**
 *
 * @author valec
 */
public class Usuario {
 private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private PersonaNatural persona; // Puede ser Administrador o Comprador

    public Usuario(int idUsuario, String nombreUsuario, String contraseña, PersonaNatural persona) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.persona = persona;
    }

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public PersonaNatural getPersona() {
        return persona;
    }

    public String getTipoUsuario() {
        if (persona instanceof Administrador) {
            return "ADMINISTRADOR";
        } else if (persona instanceof Cliente) {
            return "COMPRADOR";
        }
        return "DESCONOCIDO";
    }

    // Setters
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setPersona(PersonaNatural persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return nombreUsuario + " (" + getTipoUsuario() + ")";
    }
}