/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.proyectobus;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author pedrizquierdo
 */
public class Autobus {

    private String placa;
    private String ruta;
    private int capacidad;
    private List<Pasajero> pasajeros;
    private List<Terminal> terminales;
    private int terminalActual;
    private boolean[][] asientos;
    private double totalGanancias;

    // Constructor
    public Autobus(String placa, String ruta, int capacidad, List<Terminal> terminales) {
        this.placa = placa;
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.terminales = terminales;
        this.terminalActual = 0; // Inicia en la primera terminal
        this.asientos = new boolean[5][4]; // 5 filas por 4 asientos (2 por cada lado)
        this.pasajeros = new ArrayList<>();
        this.totalGanancias = 0.0;
    }

    // Métodos principales (agregar, bajar pasajeros, mostrar asientos, generar reporte)

    public boolean agregarPasajero(Pasajero pasajero, int fila, int columna) {
        if (asientos[fila][columna]) {
            System.out.println("El asiento ya está ocupado.");
            return false;
        }
        asientos[fila][columna] = true;
        pasajeros.add(pasajero);
        totalGanancias += pasajero.getPrecio();
        return true;
    }

    public void bajarPasajeros() {
        String nombreTerminal = terminales.get(terminalActual).getNombre();
        List<Pasajero> bajan = new ArrayList<>();
        for (Pasajero p : pasajeros) {
            if (p.getDestino().equals(nombreTerminal)) {
                bajan.add(p);
                liberarAsiento(p.getNumeroAsiento());
            }
        }
        pasajeros.removeAll(bajan);
        System.out.println("Se bajaron " + bajan.size() + " pasajeros en " + nombreTerminal);
    }

    private void liberarAsiento(int numeroAsiento) {
        int fila = (numeroAsiento - 1) / 4;  // Fila del asiento
        int columna = (numeroAsiento - 1) % 4;  // Columna del asiento
        asientos[fila][columna] = false;
    }

    public void avanzarTerminal() {
        if (terminalActual < terminales.size() - 1) {
            terminalActual++;
            bajarPasajeros();
        } else {
            System.out.println("El autobús ya llegó a su destino final: " + terminales.get(terminalActual).getNombre());
        }
    }

    public void mostrarAsientos() {
        System.out.println("Estado actual de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] ? "[X] " : "[O] ");
            }
            System.out.println();
        }
    }

    public void generarReporteFinal() {
        System.out.println("Reporte final del viaje:");
        for (Pasajero p : pasajeros) {
            System.out.println(p);
        }
        System.out.println("Total de ganancias: $" + totalGanancias);
    }
}
    
    
