/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.controladores;

import java.awt.event.ActionListener;
import java.util.List;
import mx.itson.proyectobus.Autobus;
import mx.itson.proyectobus.Pasajero;
import mx.itson.proyectobus.Terminal;
import mx.itson.vistas.VentaBoletos;

/**
 *
 * @author luismorellb
 */
public class VentaBoletosControlador {
    
    private VentaBoletos vista;
    private Autobus autobus;
    private Terminal terminal;

    public VentaBoletosControlador(VentaBoletos vista, Autobus autobus, Terminal terminal) {
        this.vista = vista;
        this.autobus = autobus;
        this.terminal = terminal;

        
    }}
