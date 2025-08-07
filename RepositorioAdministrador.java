/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valec
 */
public class RepositorioAdministrador {
   private static ArrayList<Administrador> listaAdministradores = new ArrayList<>();
    
    public static void agregarAdministrador(Administrador admin) {
        listaAdministradores.add(admin);
    }

    public static ArrayList<Administrador> obtenerTodos() {
        return listaAdministradores;
    }

    public static Administrador buscarPorDocumento(String documento) {
        for (Administrador admin : listaAdministradores) {
            if (admin.getNumeroDocumento().equals(documento)) {
                return admin;
            }
        }
        return null;
    }

    public static boolean eliminarPorDocumento(String documento) {
        Administrador admin = buscarPorDocumento(documento);
        if (admin != null) {
            listaAdministradores.remove(admin);
            return true;
        }
        return false;
    }
}