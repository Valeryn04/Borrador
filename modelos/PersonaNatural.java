
package com.mycompany.ventanaagroclientes.modelos;

/**
 *
 * @author valec
 */
    public abstract class PersonaNatural {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String tipoDocumento;
    protected String numeroDocumento;

    public PersonaNatural(String nombre, String apellido, String telefono, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
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
    
     public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return getNombreCompleto() + " - Documento: " + numeroDocumento;
    }
}

