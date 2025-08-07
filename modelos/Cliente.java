
package com.mycompany.ventanaagroclientes.modelos;

import java.util.ArrayList;

/**
 *
 * @author valec
 */
public class Cliente extends PersonaNatural {
    public Cliente(String nombre, String apellido, String telefono,String tipoDocumento, String numeroDocumento) {
        super(nombre, apellido, telefono,tipoDocumento, numeroDocumento);
    }
}