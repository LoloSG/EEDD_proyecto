/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesarestado;

/**
 *
 * @author alu_tarde
 */
public class Cesar {
   
    static String cifrar(String texto, int n) {
        String resultado="";
        
        for (int i = 0; i < texto.length(); i++) {
            char car=texto.charAt(i);
            
            if (Character.isLetter(car)) {
                int codigo=(int)car;
                int nuevo=codigo+n;
                
                car= (char)nuevo;
                
                if(Character.isLowerCase(car)){
                    if(car>'z'){
                        car=(char)(car-'z'+'a'+1);
                    }else{
                        if (car>'Z') {
                            car=(char)(car-'Z'+'A'-1);
                            
                        }
                    }
                    
                }
            }
            resultado=resultado+car;
        }
        
        return resultado;
    }
    
    
    
}
