/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgObjetos;
import java.util.Scanner;
/**
 *
 * @author alu_tarde
 */
public class Persona {
    Scanner sc=new Scanner(System.in);
    String nombre="Juana";
    double altura=1.69;
    int edad;  //lo que cambies se cambia para todos
    String DNI;
    static String Semana="Sabado";
    
//    Persona(String nombre,double altura,int edad,String Semana){
//        this.nombre=nombre;
//        this.altura=altura;
//        this.edad=edad;
//        Persona.Semana=Semana;
//        
//    }      //Estos son cosntructores
//    
//    Persona(String nombre,double estatura){
 //      this(nombre,altura,10,"Martes") esto es lo mismo que lo de abajo pero mas simplifciado
//        this.nombre=nombre;
//        this.altura=altura;
//        edad=10;
//        Semana="Martes";
//        System.out.println("Objeto creado");
//    }
//    
    
    
    void saludar(){
        System.out.println("Hola "+nombre);
    }
    
    void cumpliraños(){
        int edad=10;
        edad++;//tambien se puede hacer this.edad++;
        this.edad=edad;
       System.out.println("Cumples años tal dia "+Semana +"y tu edad seria "+edad);
}
    
    void crecer(double incremento){
        altura +=incremento;
        
        System.out.println("Tu altura ahora es "+altura);
    }
    
     static void hoyEs(int dia) {
    switch (dia) {
        case 1:
            Semana = "Lunes";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 2:
            Semana = "Martes";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 3:
            Semana = "Miércoles";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 4:
            Semana = "Jueves";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 5:
            Semana = "Viernes";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 6:
            Semana = "Sábado";
            System.out.println("Hoy el dia es "+Semana);
            break;
        case 7:
            Semana = "Domingo";
            System.out.println("Hoy el dia es "+Semana);
            break;
        default:
            System.out.println("Día inválido");
            break;
    }
    
}
}
