/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cesarestado;

import static cesarestado.Cesar.cifrar;

/**
 *
 * @author alu_tarde
 */
public class CesarEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto="edad";
        int n=3;
        String Cifrado=cifrar(texto,n);
        System.out.println("Texto cifrado "+ Cifrado);
    }
    
}
