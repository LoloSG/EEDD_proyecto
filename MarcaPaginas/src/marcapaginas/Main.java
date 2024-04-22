/*

Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro 
(mediante el dato de la última página leída). 
La clase deberá disponer de métodos para incrementar la página leída, 
obtener información de la última página leída, 
y para comenzar desde el principio una nueva lectura del mismo libro.

*/
package marcapaginas;


public class Main {


    public static void main(String[] args) {
        
        Marcapaginas marca = new Marcapaginas(90);
        
        System.out.println(marca.getUltimaPagina());
        marca.incrementarPagina();
        System.out.println(marca.getUltimaPagina());
        marca.setNuevoComienzo();
        System.out.println(marca.getUltimaPagina());
    }
    
}
