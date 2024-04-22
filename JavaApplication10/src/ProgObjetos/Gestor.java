/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgObjetos;

/**
 *
 * @author alu_tarde
 */
public class Gestor {
    public String nombre;
    static String telefono;
    int importeMax;
    
      public Gestor(String nombre,String telefono,int importeMax){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMax=importeMax;
        
      }
      
      public Gestor(String nombre,String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMax=10000;
        
      }
      
      
      
      
      public String setTelefono(String telefono){
          return this.telefono=telefono;
      }
       
      
      public void muestra(){
          System.out.println("EL telefono "+telefono);
      }
    
    
    
}
