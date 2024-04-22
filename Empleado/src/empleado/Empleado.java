/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
import empleado.Persona;
/**
 *
 * @author alu_tarde
 */
public class Empleado extends Persona {
    double salario;
    
    
    public Empleado(String nombre,int edad,double estatura,double salario){
//        this.nombre=nombre;
//        this.edad=edad;
//        this.estatura=estatura; cuando ponemos this es para llamar a la clase de esta
        super(nombre,edad,estatura);
        this.salario=salario;
        
    }
  
    @Override
    public void  mostrarDatos(){
        
        super.mostrarDatos();
        System.out.println("El salario es "+salario);
        
    }
    
    @Override
    public String toString(){
        String cad=super.toString(); //esta es de la clase principal 
        return cad + "\nSalario del empleado " + salario;
    }
    
}
