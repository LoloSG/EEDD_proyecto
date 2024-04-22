/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ProgObjetos2;
import ProgObjetos.*;
/**
 *
 * @author alu_tarde
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        CuentaCorriente c11= new CuentaCorriente("342345l","Juan");
        
//       c11.Nombre="Mbappe";
//       c11.sacarDinero(550);
//       c11.mostrarinformacion();
//       c11.getSaldo();
//       c11.setSaldo(700);
//       c11.sacarDinero(550);
//       c11.mostrarinformacion();
        c11.getSaldo();
        
        c11.setBanco("Caja Rural");
        
        c11.mostrarinformacion();
}
}