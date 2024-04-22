/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopaquetes;

/**
 *
 * @author alu_tarde
 */
public class Alumno {
    public String nombre;
    private double notaMedia;
    String direccion;
    
    //si es accesible desde el metodo
    public void asignaNota (double notaMedia){
        if(notaMedia < 0 || notaMedia > 10){
            System.out.println("Nota invalIda");
        }else{
            this.notaMedia=notaMedia;
        }
    }
}
