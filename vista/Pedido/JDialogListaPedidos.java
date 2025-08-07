package com.mycompany.ventanaagroclientes.vista.Pedido;

import com.mycompany.ventanaagroclientes.modelos.ItemPedido;
import com.mycompany.ventanaagroclientes.modelos.Pedido;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class JDialogListaPedidos extends JDialog {

    public JDialogListaPedidos(Frame parent, List<Pedido> pedidos) {
        super(parent, "Lista de Pedidos", true);
        setSize(700, 400);
        setLocationRelativeTo(parent);

        String[] columnas = {"ID", "N° Orden", "Comprador", "Total Ítems", "Total Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Pedido pedido : pedidos) {
            int totalCantidad = pedido.getItems().stream().mapToInt(ItemPedido::getCantidad).sum();
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getNumeroOrden(),
                pedido.getComprador().getNombre(),
                pedido.getItems().size(),
                totalCantidad
            });
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);
    }
}
