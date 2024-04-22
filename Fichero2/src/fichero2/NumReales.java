/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**Crear el fichero de NumerosReales.txt lo creamos en el directorio netbeans actual y escribir en el fichero
 * una serie de numeros reales separados con espacios simples implementar un programa que acceda a numerosReales.txt
 * lea los numeros y calcule la suma y la media aritmeticas
 *
 * @author alu_tarde
 */
public class NumReales {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]) {
        // TODO code application logic here
        
         int num=0;
        String texto="";
      FileReader file = null; //para que sea visible en cualquier parte del main hay que declararlo aqui
       BufferedReader bufferedReader =null;
      int contador=0;
      double suma=0.0;
           
       
        try {
            file =new FileReader("/home/alu_tarde/NetBeansProjects/Fichero2/NumerosReales.txt");
             bufferedReader = new BufferedReader(file);
              
             String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] numeros = linea.split(" ");
                System.out.println(Arrays.toString(numeros));
            
          
                for (int i = 0; i < numeros.length; i++) {
                    double num2 = Double.parseDouble(numeros[i]);
                    suma += num2;
                    contador++;
                }
                
            

            double media = suma / contador;
            System.out.println("Suma de los números: " + suma);
            System.out.println("Media aritmética: " + media);  
          }       
                 
        }catch(FileNotFoundException ex){
            
            System.out.println("fichero no encontrado");
               
             
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }finally{
            
            try{
                file.close();
                 bufferedReader.close();
                
                
                
            }catch (IOException ex){
                System.out.println(ex);
            }
                   
        }
       
       }
    }

