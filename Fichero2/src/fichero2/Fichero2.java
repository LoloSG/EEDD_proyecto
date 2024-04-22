/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichero2;
import java.io.*;
/**
 *
 * @author alu_tarde
 */
public class Fichero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
       
        int num=0;
        String texto="";
      FileReader file = null; //para que sea visible en cualquier parte del main hay que declararlo aqui
       
 
           
       
        try {
            file =new FileReader("/home/alu_tarde/NetBeansProjects/Entrega/src/entrega/bombilla.java");
               num= file.read();
               char letra = (char)num;
               while(num!=-1){
              
               texto=texto+(char)letra;
               
                num= file.read();
                letra = (char)num;
                 
               }
               System.out.println(texto);
               
        }catch(FileNotFoundException ex){
            
            System.out.println("fichero no encontrado");
               
             
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }finally{
            
            try{
                if(file!=null){
                    
                
                file.close();
                }
            }catch (IOException ex){
                System.out.println(ex);
            }
                   
        }
       
       }
        
    
    
}
