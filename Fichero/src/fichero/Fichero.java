/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichero;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author alu_tarde
 */
public class Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int res,a,b;
        
        a=10;
        b=0;

        try {
            System.out.println("Resultado = "+division(a,b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try{
            //Bloque que trabaja con fichero
            System.out.println(10/5);
            return;
        }catch(Exception e){
            //bloque si salta la excepcion
            System.out.println(" division entre 0");
}finally{//se ejecuta si o si
            System.out.println("Finally");  
            
            try {
                System.out.println("Introduzca edad");
                int edad = new Scanner(System.in).nextInt();
                if (edad<0) {
                    throw new ExcepcionEdad();
                    
                }else{
                    System.out.println("Edado correcta"+edad);
                }
            } catch (ExcepcionEdad e) {
                System.out.println(e.toString());
            } finally {
            }
            
        }
        
//        try {
//            res=a/b;
//            System.out.println("Prueba");
//        } catch (ArithmeticException | IOException e1) {      
//            System.out.println(e.getMessage());
//        }catch (Exception e){            //si entra en el primero no va a entrar en el segundo la segunda la podemos quitar
//            System.out.println("entra aqui"+e.getMessage());
//        }
//        System.out.println("Mensaje final");
    }
        
        static int division(int a , int b) throws ArithmeticException{
            int res=0;
            res=a/b;
        
            return res;
        }
    
    
}
