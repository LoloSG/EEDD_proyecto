/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *Crear un editor de texto un archivo con un conjunto de numeros reales(uno por linea),abrirlo con un flujo de 
 * texto para lectura y leerlo linea a linea.Convertir las cadenas en numeros de tipo double por medio de Scanner
 * y mostrar al final la suma de todos ellos
 * @author alu_tarde
 */
public class excepciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
     
        Scanner sc;
          FileReader file = null; 
          BufferedReader bufferedReader =null;
        try {
            file =new FileReader("/home/alu_tarde/NetBeansProjects/Excepciones/num.txt");
            bufferedReader = new BufferedReader(file);
         
            double numero;
            double suma=0;
         
         String linea=bufferedReader.readLine();
         
            while (linea!=null) { //recorre la linea
              sc = new Scanner(linea); //hacemos el scanner que la procesara en el scanner
                if (sc.hasNextDouble()) {//comprubea si es double

               numero= sc.nextDouble();  //al scanner le peudes pasar strings se almacena en numero el double
               suma+=numero; //lo suma
            
               linea=bufferedReader.readLine(); //volvemos a hacer la lectura yempieza de nueva
                
               
                }
                System.out.println("suma"+ suma);
                
            }
         
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            
            if(bufferedReader!=null){
                try{
                    bufferedReader.close();
                    file.close();
                }catch(IOException ex){
                    System.out.println(ex.getMessage());
                    
                }
            }
        }
        
        
    }
}
