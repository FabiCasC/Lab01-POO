/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fabia
 */

public class Empleado {
    private String codigo;
    private String nombres;
    private String areaLaboral;
    private double sueldoBase;
    private int horasExtras;
    private String tipoSeguro;
    
    // Constructor
    public Empleado(String codigo, String nombres, String areaLaboral, 
            double sueldoBase, int horasExtras, String tipoSeguro) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.areaLaboral = areaLaboral;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoSeguro = tipoSeguro;
    }
    
    // Métodos de cálculo
    public double MontoHExtras() {
        return (sueldoBase * horasExtras) / 240;
    }
    
    public double MontoSeguro() {
        if (tipoSeguro.equals("AFP")) {
            return sueldoBase * 0.17;
        } else {
            return sueldoBase * 0.05;
        }
    }
    
    public double MontoEssalud() {
        return sueldoBase * 0.03;
    }
    
    public double MontoDescuentos() {
        return MontoSeguro() + MontoEssalud();
    }
    
    public double SueldoBruto() {
        return sueldoBase + MontoHExtras();
    }
    
    public double SueldoNeto() {
        return SueldoBruto() - MontoDescuentos();
    }
    
    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public void setAreaLaboral(String areaLaboral) {
        this.areaLaboral = areaLaboral;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
}
