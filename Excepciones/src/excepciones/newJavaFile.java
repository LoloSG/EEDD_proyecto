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
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = null;
        FileReader file = null;
        BufferedReader bf=null;
        
        try {
            
            file=new FileReader("/home/alu_tarde/NetBeansProjects/Excepciones/jug.txt");
            bf=new BufferedReader(file);
            double numero=0;
            double suma=0;
            int contador=0;
            String nombre=null;
            String linea= bf.readLine();
             while (linea!=null) { //recorre la linea
                 
                 System.out.println(linea);
                 if (sc.hasNextLine()) {//comprubea si es cadena String

               nombre= sc.next();  //al scanner le peudes pasar strings se almacena en numero el double
          
               linea=bf.readLine(); //volvemos a hacer la lectura yempieza de nueva
                
               
                }
              
                sc = new Scanner(linea); //hacemos el scanner que la procesara en el scanner
                if (sc.hasNextDouble()) {//comprubea si es double

               numero= sc.nextDouble();  //al scanner le peudes pasar strings se almacena en numero el double
               suma+=numero; //lo suma
                contador++;
               linea=bf.readLine(); //volvemos a hacer la lectura yempieza de nueva
                
               
                }
                 System.out.println("nombre"+nombre);
                System.out.println("suma"+ suma);
                
            }
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
