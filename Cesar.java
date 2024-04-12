/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clasecesar;


import java.util.Scanner;
import java.util.Arrays;

/**
 * Description: [Breve descripción del propósito de la clase]
 * Author: alu_tarde
 */
public class Cesar {
    
static String codificacion(String cadena,int posiciones){
    char letras[] = cadena.toCharArray();
    String abecedario = "abcdefghijklmnñopqrstuvwxyz";
    String abecedarioMayus = "ABCDEFGHYJKLMNÑOPQRSTUVWXYZ";
    char abc[] = abecedario.toCharArray();
    
    
    for (int i = 0; i < letras.length; i++) {
        
        int posicion = abecedario.indexOf(letras[i]);
        int posicionMayus = abecedario.indexOf(letras[i]);
        
        
        if (posicionMayus>=0) {
            if (posiciones+posicionMayus < abecedario.length()) {
                letras[i] = abc[posicionMayus+posiciones];
            }else{
                letras[i] = abc[0+posiciones-2];
            }
            
        }else{
            letras[i] = letras[i];
        }
        if (posicion>=0) {
            char c = abc[posicion + posiciones];
            if (c>'z') {
                c = c - 'z' + 'a'-1;
            }
            
        }else{
            letras[i] = letras[i];
        }
        
    }
    
    return new String(letras);
}

}
