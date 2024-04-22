/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgObjetos;

/**
 *
 * @author alu_tarde
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // get y set    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora<=60 && hora>=0){
            this.hora=hora;
        }else{
            System.out.println("No ha sido posible cambiar esa hora no existe");
        }
        
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
          if (minuto<=60 && minuto>=0){
            this.minuto=minuto;
        }else{
              System.out.println("No ha sido posible cambiar la hora");
          }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
          if (segundo<=60 && segundo>=0){
            this.segundo=segundo;
        }else{//o se puede hacer con un while en el main dando un valor con el scanner y si introduce alguno que no sea valido que salga
              System.out.println("No ha sido posible cambiar la hora");
          }
    }
    
        public void incrementarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
        
        public void muestra(){
            System.out.println("La hora es "+hora+":"+minuto+":"+segundo);
        }
}
    

