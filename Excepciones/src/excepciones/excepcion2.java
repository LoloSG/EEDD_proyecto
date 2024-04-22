/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;
import java.util.Locale;
import java.util.Scanner;

/**Pide por teclado nombre,la edad y la estatura de un deportista introducelos en una sola linea
 *
 * @author alu_tarde
 */
public class excepcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);//para que use teclado numero
        
        String nombre=sc.next();
        int edad= sc.nextInt();
        double estatura = sc.nextDouble();
        
        System.out.println("Muesta"+nombre);
        System.out.println("Muestra"+edad);
        System.out.println("Muestra "+estatura);
       
        
        
    }
}
