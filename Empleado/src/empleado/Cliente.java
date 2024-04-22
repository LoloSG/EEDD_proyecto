/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author alu_tarde
 */
public class Cliente extends Persona {
    int id;
  
    
    
      public Cliente(String nombre,int edad,double estatura,int id){
//        this.nombre=nombre;
//        this.edad=edad;
//        this.estatura=estatura; cuando ponemos this es para llamar a la clase de esta
        super(nombre,edad,estatura);
        this.id=id;
        
    }
      
      public void mostrarDatos(){
          super.mostrarDatos();
          System.out.println("muestra id "+id);
      }
}
