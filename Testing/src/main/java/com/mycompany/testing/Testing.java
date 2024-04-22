package com.mycompany.testing;
import java.util.*;


public class Testing {

    public static void main(String[] args) {
        Random range = new Random();
        int num = range.nextInt(101);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escribe un número del 1 al 100");
        
        int num_usuario = scan.nextInt();
        int intentos = 1;
        int quedan = 4;        
        
        while(num_usuario != num & quedan>0){
        if (num_usuario < num){
            System.out.println("El número introducido es menor que el aleatorio");
            System.out.println("Número de intentos: " + intentos++);
            System.out.println("Te quedan: " + (quedan-intentos) + " intentos");
            num_usuario = scan.nextInt();
            
        }
        else{
            System.out.println("El número introducido es mayor que el aleatorio");
            System.out.println("Número de intentos: " + intentos++);
            System.out.println("Te quedan: " + (quedan-intentos) + " intentos");
            num_usuario = scan.nextInt();
        }
        
        if (quedan == 0){ 
            System.out.println("Te has quedado sin intentos.");
            
        }
    }
        
    }
}
