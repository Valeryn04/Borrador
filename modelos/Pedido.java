/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.modelos;

import java.util.List;

public class Pedido {

    private int idPedido;
    private long numeroOrden;
    private Comprador Comprador;  // Asumimos que esta clase existirá
    private List<Producto> productos;

    private List<ItemPedido> itemsPedido;

    // Constructor
    public Pedido(int idPedido, long numeroOrden, Comprador comprador, List<ItemPedido> itemsPedido) {
        this.idPedido = idPedido;
        this.numeroOrden = numeroOrden;
        this.Comprador = comprador;
        this.itemsPedido = itemsPedido;
    }

    // Clase estatica COMPRADOR
    public static class Comprador {

        private String nombre;
        private String cedula;

        public Comprador(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCedula() {
            return cedula;
        }

        @Override
        public String toString() {
            return nombre + " (C.C. " + cedula + ")";
        }
    }

    // Getters y Setters
    public List<ItemPedido> getItems() {
        return itemsPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public long getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(long numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Comprador getComprador() {
        return Comprador;
    }

    public void setComprador(Comprador comprador) {
        this.Comprador = comprador;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
