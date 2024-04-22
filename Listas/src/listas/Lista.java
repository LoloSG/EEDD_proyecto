/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;
import java.util.Arrays;
/**
 *
 * @author alu_tarde
 */
public class Lista {
    int [] arrayEnteros;
    
    
    public Lista(int[] arrayEnteros){
        this.arrayEnteros= new int[0];
        
    }
  
    
   public static int[] insertarNumero(int t[],int nuevo){
     int indiceInsercion=0;
        for (int i = 0; i < t.length; i++) {
            if (t[i]==nuevo) {
                indiceInsercion=nuevo;
            }
        }
         
        if (indiceInsercion < 0) {
            //calcula dónde debería estar
            indiceInsercion = -indiceInsercion - 1;
        }

        int copia[] = new int[t.length + 1];

        System.arraycopy(t, 0, copia, 0, indiceInsercion);

        System.arraycopy(t, indiceInsercion,
                copia, indiceInsercion + 1, t.length - indiceInsercion);

        copia[indiceInsercion] = nuevo;
        t = copia; //t referencia la nueva tabla
        t[t.length-1]=nuevo;
        return t;
    }
    
   public static int[] insertarNumeroEnd(int t[],int nuevo){
        
        int copia[]=new int[t.length+1];
        copia[copia.length-1]=nuevo;
        copia=Arrays.copyOf(t, t.length);
        return copia;
    }
    
   public static int[] insertarNumeroStart(int t[],int nuevo){
        int copia[]=new int[t.length+1];
        copia[copia.length-1]=nuevo;
        System.arraycopy(t, 0, copia, 1, t.length);
        return copia;
        
    }
    
    
    public static int[] insertarOtralista(int t[],int[] lista2){
        int[] lista1=new int[t.length+lista2.length];
        System.arraycopy(t, 0, lista1, 0, t.length);
        System.arraycopy(lista2, 0, lista1, t.length, lista2.length);
        
        
        return lista1;
        
    }
    
    public static int[] borrar(int t[],int indice){

        System.arraycopy(t, indice + 1, t, indice, t.length - (indice + 1));
        t = Arrays.copyOf(t, t.length - 1);

        return t;
    }
    
    public int obtenerElemento(int t[],int indice){
        int numero=0;
        for (int i = 0; i < t.length; i++) {
            if (t[i]==t[indice]) {
                t[i]=numero;
                
                
            }
        }
        return numero;
    }
        
    }
    
    
