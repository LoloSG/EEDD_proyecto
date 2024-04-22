/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alu_tarde
 */
public class ff {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        FileWriter file= null;
        
         BufferedWriter bf=null;
        try { 
            file = new FileWriter( "elcurro");
            bf=new BufferedWriter(file);
            bf.write('A');
            bf.newLine();
            bf.write("ME  alvaro");
           
            bf.newLine();
            
           String cad="En un lugar de la mancha";
            for (int i = 0; i < cad.length(); i++) {
                bf.write(cad.charAt(i));
                
            }
            
            bf.newLine();
            bf.write(cad);
            
             //si queremos leerlo luego se tiene que escribir entero y luego le queremos
            //leer todavia la informacion esta en el buffer habria que hacer un flush o un close
            //por eso mejor hacer el flush aqui y luego el close en el finally
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            try {
                 if(bf!=null){
                     bf.close();
                 }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
}
