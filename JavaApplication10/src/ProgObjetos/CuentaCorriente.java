/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgObjetos;

/**
 *1.Modificar la visibilidad  cuentaCorriente para que sea visible desde clases externas y 
 * la visibilidad de sus atributos para que saldo no sea visible para otras clases
 * nombre sea publico para cualquier clase y dni solo sea visible para clases vecinas.
 * Realizar un programa pa ver la visbilidad de los programas
 *
 * 2.Todas las cuentasCOrrientes ocn las que se va a trabajar pertenecen al mismo banco
 * añadir un atributo que almacene el nombre del banco que es unico en la clase cuenta corriente.
 * Diseñar un metodo que permita recuperar y modificar el nombre del banco al que pertenece todas
 * las cuentas corrientes y el nombre del banco es privado.
 * 
 * 
Existen gestores que administran cuentas bancarias y atienden a sus propietarios. 
Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de la 
* que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que se puede operar. 
*Con respecto a los gestores, existen las siguientes restricciones:
Un gestor tendrá siempre un nombre y un teléfono.
Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo 
* podrá consultarlo.
El nombre será público y el importe máximo sólo será visible por clases vecinas.
Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.

 * @author alu_tarde
 */
public class CuentaCorriente {
    String Dni;
    public String Nombre;
    private double saldo=0;
    private static String banco;
    Gestor gestor;
    
    public CuentaCorriente(String Dni,String Nombre,Gestor gestor){
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.gestor=gestor;
//        this.saldo=saldo; //esto se puede no poner
    }
    
    
    

    
    
    public CuentaCorriente(String Dni,Double saldo){
    this.Dni=Dni; 
    this.Nombre="Felipe";
    this.saldo=saldo;
    }

    public CuentaCorriente(String Dni,String Nombre,Double saldo) {
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.saldo=saldo;
    }
    
     static void  setBanco(String nuevoBanco){
       banco=nuevoBanco;     
    }
     
     
     
     public String getBanco(){
         return banco;
     }
    public double getSaldo(){
        return saldo;
    }
    
    public void  setGestor(Gestor gestorNuevo){
        this.gestor=gestorNuevo;
    }
    
    public void setSaldo(double saldo){
        if (saldo>0) {
        this.saldo=saldo;    
        }else{
            System.out.println("No se ha podido asignar el saldo");
        }
        
    }
    
    
    
    
    public void sacarDinero(int numero){
        boolean posible=true;
        if (saldo>0 && numero<=saldo) {
            System.out.println("Se ha podido sacar dinero "+posible);
            saldo=saldo-numero;
            
        }else{
            posible=false;
            System.out.println(posible+" No es posible sacar dinero porque no tienes lo suficente");
        }
        
    }
    
    public void ingresar(int numero){
        System.out.println("Ingresamos dinero a la cuenta");
        saldo=saldo+numero;
        
       
    }
    
    public void mostrarinformacion(){
        System.out.println("La cuenta esta a nombre de "+Nombre);
        System.out.println("Con DNI "+ Dni);
        System.out.println("El saldo actual es "+saldo);
        System.out.println("El banco del que has sacado dinero es "+ banco);
        System.out.println("El gestor seria "+gestor);
    }
    
   
}