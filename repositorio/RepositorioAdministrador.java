/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaagroclientes.repositorio;

import com.mycompany.ventanaagroclientes.modelos.Administrador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valec
 */
public class RepositorioAdministrador {
   private static List<Administrador> listaAdministradores = new ArrayList<>();
    
    public static void agregarAdministrador(Administrador admin) {
        listaAdministradores.add(admin);
    }

    public static List<Administrador> obtenerTodos() {
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
        return listaAdministradores.removeIf(admin -> admin.getNumeroDocumento().equals(documento));
    }

}
