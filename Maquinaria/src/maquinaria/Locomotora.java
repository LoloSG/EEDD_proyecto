/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaria;

import personal.*;
import java.time.LocalDate;

/**
 *
 * @author alu_tarde
 */
public class Locomotora {
         private String matricula;
            private int potencia;
            private LocalDate fabricacion;
            private personal.Mecanico mecanicoEncargado;
            
            
            public Locomotora(String matricula,int potencia,LocalDate fabricacion,personal.Mecanico mecanicoEncargado){
                this.matricula=matricula;
                this.potencia=potencia;
                this.fabricacion=fabricacion;
                this.mecanicoEncargado=mecanicoEncargado;
            }
        }