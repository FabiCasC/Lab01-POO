/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author fabia
 */

import model.Empleado;
import vista.EmpleadoView;
import java.awt.event.*;

public class EmpleadoController {
    private final EmpleadoView vista;
    private Empleado modelo;
    
    public EmpleadoController(EmpleadoView vista) {
        this.vista = vista;
        
        // Agregar listeners a los botones
        this.vista.btnCrear.addActionListener((ActionEvent e) -> {
            crearEmpleado();
        });
        
        this.vista.btnMostrar.addActionListener((ActionEvent e) -> {
            mostrarInformacion();
        });
        
        this.vista.btnLimpiar.addActionListener((ActionEvent e) -> {
            limpiarCampos();
        });
        
        this.vista.btnSalir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    
    private void crearEmpleado() {
        try {
            String codigo = vista.txtCodigo.getText();
            String nombres = vista.txtNombres.getText();
            String area = vista.cboArea.getSelectedItem().toString();
            double sueldoBase = Double.parseDouble(vista.txtSueldoBase.getText());
            int horasExtras = Integer.parseInt(vista.txtHorasExtras.getText());
            String tipoSeguro = vista.cboSeguro.getSelectedItem().toString();
            
            modelo = new Empleado(codigo, nombres, area, sueldoBase, horasExtras, tipoSeguro);
            vista.txtResultado.setText("Empleado creado exitosamente!");
        } catch (NumberFormatException ex) {
            vista.txtResultado.setText("Error: Ingrese valores numéricos válidos");
        }
    }
    
    private void mostrarInformacion() {
        if (modelo != null) {
            StringBuilder info = new StringBuilder();
            info.append("Información del Empleado:\n\n");
            info.append("Código: ").append(modelo.getCodigo()).append("\n");
            info.append("Nombres: ").append(modelo.getNombres()).append("\n");
            info.append("Área: ").append(modelo.getAreaLaboral()).append("\n");
            info.append("Sueldo Base: S/").append(String.format("%.2f", modelo.getSueldoBase())).append("\n");
            info.append("Monto Horas Extras: S/").append(String.format("%.2f", modelo.MontoHExtras())).append("\n");
            info.append("Monto Seguro: S/").append(String.format("%.2f", modelo.MontoSeguro())).append("\n");
            info.append("Monto EsSalud: S/").append(String.format("%.2f", modelo.MontoEssalud())).append("\n");
            info.append("Monto Descuentos: S/").append(String.format("%.2f", modelo.MontoDescuentos())).append("\n");
            info.append("Sueldo Bruto: S/").append(String.format("%.2f", modelo.SueldoBruto())).append("\n");
            info.append("Sueldo Neto: S/").append(String.format("%.2f", modelo.SueldoNeto())).append("\n");
            
            vista.txtResultado.setText(info.toString());
        } else {
            vista.txtResultado.setText("Error: Primero debe crear un empleado");
        }
    }
    
    private void limpiarCampos() {
        vista.txtCodigo.setText("");
        vista.txtNombres.setText("");
        vista.txtSueldoBase.setText("");
        vista.txtHorasExtras.setText("");
        vista.cboArea.setSelectedIndex(0);
        vista.cboSeguro.setSelectedIndex(0);
        vista.txtResultado.setText("");
        modelo = null;
    }
}
