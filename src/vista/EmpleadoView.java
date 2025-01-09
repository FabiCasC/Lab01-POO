/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.Color;

public class EmpleadoView extends JFrame {
    public JTextField txtCodigo;
    public JTextField txtNombres;
    public JTextField txtSueldoBase;
    public JTextField txtHorasExtras;
    public JComboBox<String> cboArea;
    public JComboBox<String> cboSeguro;
    public JTextArea txtResultado;
    public JButton btnCrear;
    public JButton btnMostrar;
    public JButton btnLimpiar;
    public JButton btnSalir;
    
    public EmpleadoView() {
        // Configurar el Look and Feel de Windows
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setTitle("Uso de Clases, Objetos, atributos y Métodos");
        setLayout(null);
        
        // Panel principal con borde 3D
        JPanel mainPanel = new JPanel(null);
        mainPanel.setBounds(5, 5, 510, 460);
        mainPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createLoweredBevelBorder()
        ));
        
        // Etiquetas
        JLabel lblCodigo = new JLabel("Código");
        lblCodigo.setBounds(10, 10, 50, 20);
        mainPanel.add(lblCodigo);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(150, 10, 50, 20);
        mainPanel.add(lblNombre);
        
        JLabel lblTipoSeguro = new JLabel("Tipo de Seguro");
        lblTipoSeguro.setBounds(350, 10, 100, 20);
        mainPanel.add(lblTipoSeguro);
        
        JLabel lblSueldoBase = new JLabel("Sueldo Base");
        lblSueldoBase.setBounds(10, 60, 70, 20);
        mainPanel.add(lblSueldoBase);
        
        JLabel lblHorasExtras = new JLabel("Horas Extras");
        lblHorasExtras.setBounds(150, 60, 70, 20);
        mainPanel.add(lblHorasExtras);
        
        JLabel lblArea = new JLabel("Area");
        lblArea.setBounds(350, 60, 50, 20);
        mainPanel.add(lblArea);
        
        // Campos de texto con borde 3D
        txtCodigo = new JTextField();
        txtCodigo.setBounds(10, 30, 100, 20);
        txtCodigo.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(txtCodigo);
        
        txtNombres = new JTextField();
        txtNombres.setBounds(150, 30, 180, 20);
        txtNombres.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(txtNombres);
        
        txtSueldoBase = new JTextField();
        txtSueldoBase.setBounds(10, 80, 100, 20);
        txtSueldoBase.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(txtSueldoBase);
        
        txtHorasExtras = new JTextField();
        txtHorasExtras.setBounds(150, 80, 100, 20);
        txtHorasExtras.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(txtHorasExtras);
        
        // ComboBoxes con borde 3D
        cboSeguro = new JComboBox<>(new String[]{"---SELECCIONE---", "AFP", "SNP"});
        cboSeguro.setBounds(350, 30, 150, 20);
        cboSeguro.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(cboSeguro);
        
        cboArea = new JComboBox<>(new String[]{"---SELECCIONE-----", "Sistemas", "Administración", "Marketing"});
        cboArea.setBounds(350, 80, 150, 20);
        cboArea.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        mainPanel.add(cboArea);
        
        // Área de texto con borde 3D
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        scrollPane.setBounds(10, 120, 490, 280);
        scrollPane.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createLoweredBevelBorder()
        ));
        mainPanel.add(scrollPane);
        
        // Botones con estilo Windows clásico
        btnCrear = new JButton("Crear Objeto");
        btnCrear.setBounds(10, 410, 100, 25);
        btnCrear.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        mainPanel.add(btnCrear);
        
        btnMostrar = new JButton("Mostrar Informacion del Objeto");
        btnMostrar.setBounds(120, 410, 200, 25);
        btnMostrar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        mainPanel.add(btnMostrar);
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(330, 410, 80, 25);
        btnLimpiar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        mainPanel.add(btnLimpiar);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(420, 410, 80, 25);
        btnSalir.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        mainPanel.add(btnSalir);
        
        // Agregar el panel principal
        add(mainPanel);
        
        // Configuración de la ventana
        setSize(535, 515);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Color de fondo
        mainPanel.setBackground(new Color(236, 233, 216)); // Color típico de Windows clásico
    }
}