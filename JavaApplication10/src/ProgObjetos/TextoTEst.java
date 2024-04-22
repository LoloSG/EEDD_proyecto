/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ProgObjetos;

/**
 *
 * @author alu_tarde
 */
public class TextoTEst {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Texto texto = new Texto(50); // Crear un objeto Texto con longitud máxima de 50 caracteres
        texto.agregarCadenaAlPrincipio("Que pasa primo ");
        texto.agregarCaracterAlFinal('f');
        texto.agregarCaracterAlFinal('H');
        texto.agregarCaracterAlFinal('o');
        texto.agregarCaracterAlFinal('l');
        texto.agregarCaracterAlFinal('a');
        texto.agregarCadenaAlFinal(" Mundo!");
        texto.mostrarInformacion();
    }

}
