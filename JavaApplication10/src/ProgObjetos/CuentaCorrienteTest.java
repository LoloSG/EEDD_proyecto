/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ProgObjetos;

/**
 *
 * @author alu_tarde
 */
public class CuentaCorrienteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
      
//        CuentaCorriente c1=new CuentaCorriente("33333333l","Juan");
//        c1.setBanco("BBVA");
//        
//        
//        c1.ingresar(50);
//        c1.ingresar(300);
//        c1.mostrarinformacion();
//        c1.sacarDinero(50);
//        c1.sacarDinero(20);
//        c1.sacarDinero(280);
//        c1.mostrarinformacion();
//        c1.sacarDinero(0);
//        c1.mostrarinformacion();
//          System.out.println("");
//         c1 = new CuentaCorriente("54342345L",550.0);
//         c1.setBanco("CAIXA");
//        c1.mostrarinformacion();
//        c1.sacarDinero(550);
//          System.out.println("");
//        c1= new CuentaCorriente("43225435J","mbappe",72000000.0);
//        c1.mostrarinformacion();
//        c1.sacarDinero(71500000);
//        c1.mostrarinformacion();
        
        Gestor g1=new Gestor("MAnuel","8989899");
        Gestor g2=new Gestor("Juan","54342342");
        
       CuentaCorriente c1=new CuentaCorriente("33333333l","Juan",g1);
       CuentaCorriente c2=c1;
       c2.setGestor(g2); //le establecemos otro gestor
       c1.mostrarinformacion();
       
        
        
         
    }
}
