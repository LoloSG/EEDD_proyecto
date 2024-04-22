/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author alu_tarde
 */
public class Persona {
    String nombre;
    int edad;
    double estatura;
    
    public Persona(String nombre,int edad,double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
           
 public void mostrarDatos(){
     System.out.println("Muestra nombre "+nombre);
     System.out.println("Muestra edad "+edad);
     System.out.println("Muestra estatura "+estatura);
     
 }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
 
 
  
    
}
