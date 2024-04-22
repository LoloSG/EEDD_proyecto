/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10abr;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *HAcer un ejercicio  de int leer() hay que meter un valor entero y si no lo mete hay que mostrar un error
 * con las siguiente exception InputMisMATCHException.
 * @author alu_tarde
 */
public class EJ10abr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Resultado"+leerEntero());
        
        
   
    }    
       
        
   public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        int valor=0;
        boolean salir=false;
        while (!salir) {
            try {
                System.out.print(" introduce un valor entero: ");
                valor = scanner.nextInt();
                
                salir=true;
            } catch (InputMismatchException e) {
                System.out.println("Tipo error.");
                scanner.nextLine();
                
            }
        }

        return valor;
    }
    
        
        
    
    
    
    
}
