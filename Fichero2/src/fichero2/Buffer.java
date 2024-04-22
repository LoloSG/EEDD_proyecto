/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alu_tarde
 */
public class Buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         
        int num=0;
        String texto="";
      FileReader file = null; //para que sea visible en cualquier parte del main hay que declararlo aqui
       BufferedReader bufferedReader =null;
      
           
       
        try {
            file =new FileReader("FicheroTexto");
             bufferedReader = new BufferedReader(file);
               String linea;
               
              
               
               while((linea=bufferedReader.readLine())!=null){

                   System.out.println(linea);
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

