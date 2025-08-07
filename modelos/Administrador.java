/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.modelos;

import java.util.ArrayList;

/**
 *
 * @author valec
 */
public class Administrador extends PersonaNatural {
   public Administrador(String nombre, String apellido, String telefono, String tipoDocumento, String documento) {
        super(nombre, apellido, telefono, tipoDocumento, documento);
    }
    
    

    @Override
    public String toString() {
        return "Administrador{" +
               "nombre='" + getNombre() + '\'' +
               ", apellido='" + getApellido() + '\'' +
               ", tipoDocumento='" + getTipoDocumento() + '\'' +
               ", documento='" + getNumeroDocumento() + '\'' +
               ", telefono='" + getTelefono() + '\'' +
               '}';
    }
}