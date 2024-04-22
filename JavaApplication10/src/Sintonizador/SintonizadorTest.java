/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sintonizador;

/**
 *
 * @author mohce
 */
public class SintonizadorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un sintonizador con frecuencia inicial de 85.5MHz
        Sintonizador sintonizador = new Sintonizador(85.5);

        // Subir la frecuencia
        sintonizador.up();
        sintonizador.muestra(); // Debería mostrar 86.0 MHz

        //bajamos la frecuencia
        sintonizador.down();
        sintonizador.down();
        sintonizador.muestra(); // Debería mostrar 108.0 MHz

        // Subir
        sintonizador.up();
        sintonizador.up();
        sintonizador.muestra(); // Debería mostrar 80.0 MHz
    }
}