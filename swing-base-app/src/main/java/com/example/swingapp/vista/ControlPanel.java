package com.example.swingapp.vista;

import javax.swing.*;
import java.awt.*;

/**
 * Panel de control con botones de acción y campo de texto para URL.
 */
public class ControlPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public JButton btnRun;
    public JButton btnClear;
    public JButton btnDate;
    public JButton btnCurl;
    public JButton btnExit;
    public JTextField txtUrl;

    public ControlPanel() {
        setLayout(new GridLayout(7, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        btnRun   = new JButton("▶ Ejecutar");
        btnClear = new JButton("🧹 Limpiar");
        btnDate  = new JButton("📅 Fecha");
        btnCurl  = new JButton("🌐 Curl");
        txtUrl   = new JTextField("https://example.com");
        btnExit  = new JButton("🚪 Salir");

        add(btnRun).setBackground(Color.green); 
        add(btnClear).setBackground(Color.cyan);
        add(btnDate).setBackground(Color.blue);
        add(btnCurl).setBackground(Color.yellow);
        add(txtUrl);
        add(btnExit).setBackground(Color.orange);
    }
}
