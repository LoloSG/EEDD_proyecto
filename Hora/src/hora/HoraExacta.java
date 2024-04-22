/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author alu_tarde
 */
public class HoraExacta extends Hora {
    
    int seg;

    public HoraExacta(int hora, int minutos,int seg) {
        super(hora, minutos);
        if(!setSegundos(seg)){
          this.seg=0;
            System.out.println("Error");
        }else{
          this.seg=seg;
        }
    }
    
    @Override
        void inc(){
        seg++;
        if(seg==60){
            seg=0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
   
            }
        }
    } 
        
       private boolean setSegundos(int valor){
        if(valor>=0 && valor<=59){
            this.seg=valor;
            return true;
           
        }else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        String cad=super.toString();
        return "HoraExacta{"+ cad + " seg= " + seg + '}';
    }


    @Override
    public boolean equals(Object o) {
      HoraExacta otroReloj=(HoraExacta) o;
      boolean iguales;
      if(this.hora==otroReloj.hora && this.minutos==otroReloj.minutos && this.seg==otroReloj.seg){
          iguales=true;
      }else{
          iguales=false;
      }
      return iguales;
    }
       
    
       
    
}
