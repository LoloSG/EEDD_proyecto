/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega;

/**
 *
 * @author alu_tarde
 */
public class bombilla {
    
    private boolean interruptor;
    static boolean interruptorGeneral=true;
    
   
    
    public bombilla(){
        this.interruptor=false;
    }
    
    
    public void encendida(){
        interruptor=true;
    }
    
    public void apagada(){
        interruptor=false;
    }
     
    public void  comprobarEstado(){
         if ((interruptor && interruptorGeneral)==true) {
             System.out.println("Esta encendida");
        }else{
             System.out.println("No esta encendida");
         }
     }
     
  
    
}
