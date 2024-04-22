/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

import java.time.LocalDate;

/**
 *
 * @author alu_tarde
 */
public class JefeEstacion {
        private String nombre;
        private String DNI;
        private LocalDate fechaNombramiento;

        public JefeEstacion(String nombre, String DNI, LocalDate fechaNombramiento) {
            this.nombre = nombre;
            this.DNI = DNI;
            this.fechaNombramiento = fechaNombramiento;
        }
    }
