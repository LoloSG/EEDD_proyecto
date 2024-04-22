/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrega;

/**
 *
 * @author alu_tarde
 */
public class EntregaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bombilla bombilla1=new bombilla();
        bombilla bombilla2=new bombilla();
        bombilla.interruptorGeneral=false;
        
        bombilla1.encendida();

        bombilla1.comprobarEstado();
        bombilla.interruptorGeneral=true;
        bombilla2.encendida();
        bombilla2.comprobarEstado();
        
      
    }
    
}
