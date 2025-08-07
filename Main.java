package com.mycompany.ventanaagroclientes;

import javax.swing.JFrame;
import javax.swing.JPanel;

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