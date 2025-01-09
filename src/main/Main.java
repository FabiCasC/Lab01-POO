/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
package main;

import vista.EmpleadoView;
import controlador.EmpleadoController;

public class Main {
    public static void main(String[] args) {
        EmpleadoView vista = new EmpleadoView();
        EmpleadoController controlador = new EmpleadoController(vista);
        vista.setVisible(true);
    }
}