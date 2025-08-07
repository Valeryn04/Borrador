/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.repositorio;

import com.mycompany.ventanaagroclientes.modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente {

    private static List<Cliente> listaClientes = new ArrayList<>();

    public static boolean agregarCliente(Cliente cliente) {
        if (!existeCliente(cliente.getNumeroDocumento(), cliente.getTipoDocumento())) {
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }

    public static boolean existeCliente(String numeroDocumento, String tipoDocumento) {
        return buscarCliente(numeroDocumento, tipoDocumento) != null;
    }

    public static Cliente buscarCliente(String numeroDocumento, String tipoDocumento) {
        for (Cliente c : listaClientes) {
            if (c.getNumeroDocumento().equals(numeroDocumento) &&
                c.getTipoDocumento().equalsIgnoreCase(tipoDocumento)) {
                return c;
            }
        }
        return null;
    }

    public static List<Cliente> obtenerClientes() {
        return listaClientes;
    }

    public static void mostrarClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }
    }
}