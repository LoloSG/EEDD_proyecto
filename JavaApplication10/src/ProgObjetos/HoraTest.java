/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ProgObjetos;
import java.util.Scanner;
/**
 *
 * @author alu_tarde
 */
public class HoraTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        // TODO code application logic here
// Leer la hora
        System.out.print("Introduce la hora (HH): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (MM): ");
        int minuto = sc.nextInt();
        System.out.print("Introduce los segundos (SS): ");
        int segundo = sc.nextInt();

    

        // Crear un objeto Hora con la hora introducida
        Hora h1 = new Hora(hora, minuto, segundo);

       h1.muestra();
       h1.incrementarSegundo();
       h1.muestra();
       h1.setSegundo(959);
       h1.muestra();
         // Leer la cantidad de segundos
        System.out.print("Introduce la cantidad de segundos: ");
        int cantidadSegundos = sc.nextInt();
        
         for (int i = 0; i < cantidadSegundos; i++) {
            h1.incrementarSegundo();
            h1.muestra();
        }
         
         h1.muestra();

    }
}
