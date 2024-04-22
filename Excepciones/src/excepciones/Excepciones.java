/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;
import java.util.Scanner;
import java.util.Arrays;
/**Solicitar al usuario numeros entero y guardarlos en una tabla de 5 elementos
 *
 * @author alu_tarde
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int tabla[] = new int[5];
        
        String numeros="97 9 23 1 5"; //otra forma
        Scanner scNum=new Scanner(numeros);
        
        for (int i = 0; i < tabla.length; i++) {
            int num=scNum.nextInt();
            
            tabla[i]=num;
            
            
        }
        
        System.out.println(Arrays.toString(tabla));
    }
    
}
