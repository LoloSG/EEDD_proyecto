
package marcapaginas;


public class Marcapaginas {
    
    private int ultimaPagina;

    
    Marcapaginas(int pagina){
        this.ultimaPagina = pagina;
    }
    
    int incrementarPagina(){
        return this.ultimaPagina++;
    }
    
    int getUltimaPagina(){
        return this.ultimaPagina;
    }
    
    int setNuevoComienzo(){
        return this.ultimaPagina = 0;
    }
    
}
