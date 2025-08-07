package com.mycompany.ventanaagroclientes;

import com.mycompany.ventanaagroclientes.vista.JFramePrincipal;

/**
 *
 * GRUPO 5
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFramePrincipal frame = new JFramePrincipal();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        });
    }
}