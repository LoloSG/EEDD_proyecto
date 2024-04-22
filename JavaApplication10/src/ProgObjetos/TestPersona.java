/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgObjetos;

/**
 *
 * @author alu_tarde
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
     
       
        p1.nombre="FELIPE";
        p1.altura=1.8;
        p1.edad=18;
        
        Persona p2=p1;
        
        System.out.println(p2);
        
        p2.edad++;
        
        Persona p3=new Persona();
 
        p3.nombre="Manolo";
        p3.altura=1.67;
        
        p3=p2; // ya no aputna a p3 si no que apunta a p2
        
        p1.saludar();
       
        Persona.Semana="Viernes";
         p2.cumpliraños();
         
        p1.crecer(0.1);
       
        Persona.hoyEs(2);
        
    
    }
    
}
