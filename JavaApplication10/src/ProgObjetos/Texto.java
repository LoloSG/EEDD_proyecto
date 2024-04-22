/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgObjetos;
import java.time.LocalDateTime;

/**
 *Diseñar la clase Texto que gestiona una cadena de caracteres con algunas caracterśticas:
La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud máxima, es decir, exista espacio disponible.
Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño establecido.
Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora de la última modificación efectuada.
Deberá existir un método que muestre la información que gestiona cada texto.

 * @author alu_tarde
 */
public class Texto {
    private String cadena;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;
    
      public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.cadena = "";
        this.fechaCreacion = LocalDateTime.now();
        this.ultimaModificacion = null;
    }
      
   
    // Método para añadir un carácter al principio del texto
    public void agregarCaracterAlPrincipio(char caracter) {
        if (cadena.length() < longitudMaxima) {
            cadena = caracter + cadena;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.out.println("No se puede agregar más caracteres. Se ha alcanzado la longitud máxima.");
        }
    }

    // Método para añadir un carácter al final del texto
    public void agregarCaracterAlFinal(char caracter) {
        if (cadena.length() < longitudMaxima) {
            cadena += caracter;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.out.println("No se puede agregar más caracteres. Se ha alcanzado la longitud máxima.");
        }
    }

    // Método para añadir una cadena al principio del texto
    public void agregarCadenaAlPrincipio(String nuevaCadena) {
        if (cadena.length() + nuevaCadena.length() <= longitudMaxima) {
            cadena = nuevaCadena + cadena;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.out.println("No se puede agregar más caracteres. Se ha alcanzado la longitud máxima.");
        }
    }

    // Método para añadir una cadena al final del texto
    public void agregarCadenaAlFinal(String nuevaCadena) {
        if (cadena.length() + nuevaCadena.length() <= longitudMaxima) {
            cadena += nuevaCadena;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.out.println("No se puede agregar más caracteres. Se ha alcanzado la longitud máxima.");
        }
    }

    // Método para contar las vocales en el texto
    public int contarVocales() {
        int contadorVocales = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    
     // Método para mostrar la información del texto
    public void mostrarInformacion() {
        System.out.println("Cadena de texto: " + cadena);
        System.out.println("Longitud máxima: " + longitudMaxima);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Última modificación: " + ultimaModificacion);
        System.out.println("Número de vocales: " + contarVocales());
    }

    // Método getter para obtener la cadena de texto
    public String getCadena() {
        return cadena;
    }

       
       
        
      
      
}
