
package com.mycompany.ventanaagroclientes.modelos;

/**
 *
 * @author valec
 */
    public abstract class PersonaNatural {
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoDocumento;
    private String numeroDocumento;

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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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


