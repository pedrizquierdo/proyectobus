/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.proyectobus;

/**
 *
 * @author pedrizquierdo
 */
public class Terminal {

    
    public Terminal(String nombre, int orden) {
    this.nombre = nombre;
    this.orden = orden;
}
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }
    
@Override
public String toString() {
    return "Terminal{" +
            "nombre='" + nombre + '\'' +
            ", orden=" + orden +
            '}';
}

    
    private String nombre;
    private int orden;
    
}
