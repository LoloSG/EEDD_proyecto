/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**Crea el fichero jugadores.txt en la carpeta del proyecto y escribe en el los nombres edades y estaturas
 * de los jugadores de un equipo con un jugador en cada linea implementa un programa que lea del fichero los datos
 * muestre los nombres y calcule la media de la edad y la estatura
 *
 * @author alu_tarde
 */
public class NewJavaFile {

    public static void main(String args[]) {
        Scanner sc = null;
        FileReader file = null;
        BufferedReader bf = null;

        try {
            file = new FileReader("/home/alu_tarde/NetBeansProjects/Excepciones/jug.txt");
            bf = new BufferedReader(file);

            double sumaEdades = 0;
            double sumaEstaturas = 0;
            int contador = 0;

            String linea = bf.readLine();
            while (linea != null) {
                sc = new Scanner(linea); // Inicializa el Scanner con la línea actual
                if (sc.hasNext()) { // Verifica si hay un token (nombre) en la línea
                    String nombre = sc.next(); // Lee el nombre
                    System.out.println("Nombre: " + nombre);
                     }
                    if (sc.hasNextInt()) { // Verifica si hay un entero (edad) en la línea
                        int edad = sc.nextInt(); // Lee la edad
                        sumaEdades += edad;
                        
                    }

                    if (sc.hasNextDouble()) { // Verifica si hay un double (estatura) en la línea
                        double estatura = sc.nextDouble(); // Lee la estatura
                        sumaEstaturas += estatura;
                    }
                    contador++;
               
                
                linea = bf.readLine(); // Lee la próxima línea
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
                if (bf != null) {
                    bf.close();
                }
                if (file != null) {
                    file.close();
                }
              
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
