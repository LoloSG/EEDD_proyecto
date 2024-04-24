/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class Mier {

    /**
     * @param args the command line arguments
     */



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bf = new BufferedWriter(new FileWriter("texto.txt"))) {
            
            System.out.println("Introducir linea");

            String linea;
            while (!(linea = sc.nextLine()).equals("fin")) { //si no es igual a fin la linea
                
                bf.write(linea);
                bf.newLine(); // salto de linea
            }

            System.out.println("exito");
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
    }
}

