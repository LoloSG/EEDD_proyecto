/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sintonizador;

/**
 *
 * @author mohce
 */
public class Sintonizador {
private double frecuencia;

    // Constructor que recibe la frecuencia inicial
    public Sintonizador(double frecuenciaInicial) {

        if (frecuenciaInicial < 80.0) {
            frecuencia = 80.0;
        } else if (frecuenciaInicial > 108.0) {
            frecuencia = 108.0;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }

  
    public Sintonizador() {
        frecuencia = 80.0;
    }


    public void up() {
        frecuencia += 0.5;
        // Si se supera el límite superior, volver al límite inferior
        if (frecuencia > 108.0) {
            frecuencia = 80.0;
        }
    }

    public void down() {
        frecuencia -= 0.5;
        // Si se supera el límite inferior, volver al límite superior
        if (frecuencia < 80.0) {
            frecuencia = 108.0;
        }
    }

    public void muestra() {
        System.out.println("Frecuencia sintonizada: " + frecuencia + " MHz");
    }
    
}