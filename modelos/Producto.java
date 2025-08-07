/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.modelos;

/**
 *
 * @author Andrés M
 */
public class Producto {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private float precio;

    public Producto(int idProducto, String nombre, String descripcion, float precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String toString() {
        return nombre + " ($" + precio + ")";
    }

    // Getters y setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
}
