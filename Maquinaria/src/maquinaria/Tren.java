/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaria;

import personal.*;

/**
 *
 * @author alu_tarde
 */
public class Tren {

        private Locomotora locomotora;
        Vagon vagones[];
        private personal.Maquinista maquinistaResponsable;
        private int numVagonesEnganchados;

        public Tren(Locomotora locomotora, personal.Maquinista maquinistaResponsable) {
            this.locomotora = locomotora;
            this.maquinistaResponsable = maquinistaResponsable;
            this.vagones = new Vagon[5]; 
            this.numVagonesEnganchados = 0;
        }
        
        public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
		if (numVagonesEnganchados >= 5) {
		    System.out.println("El tren no admite más vagones");
		} else {
		    Vagon v = new Vagon(numVagonesEnganchados, cargaMax, cargaActual, mercancia);
		    vagones[numVagonesEnganchados] = v;
		    numVagonesEnganchados++;
		}
    }
        
     }