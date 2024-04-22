/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package empleado;

/**
 *Clase Hora (6/3)


 * @author alu_tarde
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Empleado e = new Empleado("Pepa",23,1.7,1500);
        System.out.println(e.edad);
        System.out.println(e.salario);
        e.mostrarDatos(); //es jerarquico PErsona no puede ejecutar el mostrarDAtos de empleado
        
        
        Persona p = new Persona("FElipe",23,1.8);
        Persona p2 = new Persona("FElipe",23,1.8);
        p.mostrarDatos();
    
        
       
        p=e;
        
        p.mostrarDatos(); //se ejecuta la de empleado
  
        p= new Cliente("Alvaro cacas",24,1.9,3);//Pasa lo mismo  que arriba
        p.mostrarDatos();
        
             
        System.out.println(p.equals(e));
        System.out.println(e.toString());
        
      //object o1=e;
      //object o2=p;
      //toString() es public devuelve una cadena no recibe nada(public String toString()) deuvelve
      //el nombre de la calse al a que pertenece el objeto seguido de un @ y luego la referencia del objeto.
      
        System.out.println(p.getClass().toString());
        
        Class c1=p.getClass();
        System.out.println(c1);
        System.out.println(p2.getClass());
        
        System.out.println(p.getClass()==p2.getClass());
        System.out.println(p.getClass().getSimpleName());
        System.out.println(p.getClass().getSuperclass());
    }
}
