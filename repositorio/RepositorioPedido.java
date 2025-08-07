/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.repositorio;

import com.mycompany.ventanaagroclientes.modelos.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés M
 */
public class RepositorioPedido {
    private static List<Pedido> pedidos = new ArrayList<>();
    private static int contadorId = 1;

    public static void agregarPedido(Pedido pedido) {
        pedido.setIdPedido(contadorId++);
        pedidos.add(pedido);
    }

    public static List<Pedido> obtenerPedidos() {
        return pedidos;
    }
}