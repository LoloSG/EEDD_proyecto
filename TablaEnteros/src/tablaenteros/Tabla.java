
package tablaenteros;

import java.util.Arrays;


public class Tabla {

    int tablaEnteros[];
    
    Tabla(){
        this.tablaEnteros = new int[10];
        for(int i = 0; i<this.tablaEnteros.length; i++){
            this.tablaEnteros[i] = i+1;
        }
    }
    
    void insertarFinal (int nuevo){
        int aux[] = new int[this.tablaEnteros.length+1];
        System.arraycopy(tablaEnteros, 0, aux, 0, tablaEnteros.length);
        aux[aux.length-1] = nuevo;
        
        this.tablaEnteros = aux;
        
        System.out.println(Arrays.toString(this.tablaEnteros));
    }
            
            
    public static void main(String[] args) {
    
        Tabla tabla = new Tabla();
        
        System.out.println(Arrays.toString(tabla.tablaEnteros));
        
        tabla.insertarFinal(90);
        
    }
         
}
