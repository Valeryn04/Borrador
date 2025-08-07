package com.mycompany.ventanaagroclientes.repositorio;

import com.mycompany.ventanaagroclientes.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProducto {

    private static final List<Producto> productos = new ArrayList<>();

    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static List<Producto> obtenerTodos() {
        return productos;
    }

    public static boolean existeId(int id) {
        for (Producto p : productos) {
            if (p.getIdProducto() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarProducto(int id) {
        for (Producto p : productos) {
            if (p.getIdProducto() == id) {
                productos.remove(p);
                return true;
            }
        }
        return false;
    }

}
