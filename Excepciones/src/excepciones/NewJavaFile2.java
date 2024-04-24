/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class NewJavaFile2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        Scanner sc = null;
        FileReader file = null;

        try {
            file = new FileReader("/home/alu_tarde/NetBeansProjects/Excepciones/jug.txt");

            double sumaEdades = 0;
            double sumaEstaturas = 0;
            int contador = 0;

            sc = new Scanner(file);
         while (sc.hasNext()) { //Se coge la linea entera si pongo hasnextline
            
                
             

                if (sc.hasNext()) { // Verifica si hay un token (nombre) en la línea
                    String nombre = sc.next(); // Lee el nombre
                    System.out.println("Nombre: " + nombre);
                     }
                    if (sc.hasNextInt()) { // Verifica si hay un entero (edad) en la línea
                        int edad = sc.nextInt(); // Lee la edad
                        sumaEdades += edad;
                        contador++;
                    }

                    if (sc.hasNextDouble()) { // Verifica si hay un double (estatura) en la línea
                        double estatura = sc.nextDouble(); // Lee la estatura
                        sumaEstaturas += estatura;
                   
                     
                }
            }

            if (contador > 0) {
                double mediaEdad = sumaEdades / contador;
                double mediaEstatura = sumaEstaturas / contador;
                System.out.println("Media de edades: " + mediaEdad);
                System.out.println("Media de estaturas: " + mediaEstatura);
            } 
           

        } catch (IOException  ex) {
            System.out.println("Error al procesar el archivo: " + ex.getMessage());
        } finally {
            
                try {
                    if (file!=null) {
                       file.close(); 
                    }
                    
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo: " + ex.getMessage());
                }
            
          
        }
    }
}
