/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**A partir de la clase Hora del ejercicio anterior, implementar la clase HoraExacta, 
 * que incluye en la hora los segundos. Además de los métodos heredados de Hora, dispondrá de:
HoraExacta(hora, minuto, segundo), que construye un objeto con los datos pasados como parámetro, 
* si estos datos son correctos. En caso contrario, se pondrá el atributo correspondiente a 0 y se mostrará 
* un mensaje indicando el error.
boolean setSegundo(valor), que asigna el valor indicado a los segundos, si está comprendido entre 0 y 59. 
* Devuelve true o false según haya sido posible modificar los segundos o no.
void inc(), que incrementa la hora en un segundo.
String toString(), que devuelve un String con la representación completa de la hora.
boolean equals(Object otro), que devuelve true si las horas comparadas coinciden en hora, minuto y segundo.

Nota: siempre que se pueda, se invocarán, dentro de los métodos definidos en la clase HoraExacta, los métodos 
* de Hora usando la palabra reservada “super”.


 *
 * @author alu_tarde
 */
public class Hora {
    int hora;
    int minutos;
    
    Hora(int hora,int minutos){
        if(!setHora(hora)){
        this.hora=0;
            System.out.println("Error");
        }else{
            this.hora=hora;
        }
        
        if(!setMinutos(minutos)){
          this.minutos=0;
            System.out.println("Error");
        }else{
          this.minutos=minutos;
        }
        
    }
    
    void inc(){
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
   
            }
        }
    }
        
    
    
   private boolean setMinutos(int valor){
        if(valor>=0 && valor<=59){
            this.minutos=valor;
            return true;
           
        }else{
            return false;
        }
        
    }
    
      private  boolean setHora(int valor){
           
        if(valor>=0 && valor<=23){
            this.hora=valor;
            return true;
           
        }else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        return   "hora=" + hora + ", minutos=" + minutos  ;
    }
       
       

    
}
