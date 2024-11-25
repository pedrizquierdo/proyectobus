/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.proyectobus;

/**
 *
 * @author pedrizquierdo
 */
public class Pasajero {

    
    public Pasajero(String nombre, String destino, double precio, int numeroAsiento) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.numeroAsiento = numeroAsiento;
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
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numeroAsiento
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * @param numeroAsiento the numeroAsiento to set
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", numeroAsiento=" + numeroAsiento +
                '}';
    }
    
    private String nombre;
    private String destino;
    private double precio;
    private int numeroAsiento;
    
}
