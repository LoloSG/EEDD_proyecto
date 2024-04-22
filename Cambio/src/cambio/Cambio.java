package cambio;

public class Cambio {

    final double dinero[] = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    private double importe;

    Cambio(double importe) {
        if (importe > 0) {
            this.importe = importe;
        } else {
            this.importe = 0;
        }
    }

    double redondeo(double importe) {

        int centena;
        int decena;
        int milesima;
        int redondeado;

        importe = importe * 1000;

        milesima = (int) importe % 10;

        importe = importe / 10;

        centena = (int) importe % 10;
        
        importe = importe/10;
        
        decena = (int) importe % 10;

        int numero2 = (int) importe / 10;
        
        if (milesima >= 5) {
            centena++;
            milesima = 0;
            if(centena==10){
                centena=0;
                decena++;
            }
            if(decena==10){
                decena=0;
                numero2++;
            }
            
        }
        
        String a = String.valueOf(numero2) + "." + String.valueOf(decena) + String.valueOf(centena)+String.valueOf(milesima);

        double e = Double.valueOf(a);
        return e;
    }

void mostrarCambio(){
        while (this.importe>0){
            
            boolean bandera = false;
            
            for(int i = 0; i<this.dinero.length && bandera == false; i++){
                if (this.importe >= this.dinero[i]){
                    this.importe -= this.dinero[i];
                    this.importe = this.redondeo(this.importe);
                    if(this.dinero[i]>=5){
                        System.out.println("Billete de "+this.dinero[i]);
                    }else{
                        System.out.println("Moneda de: "+this.dinero[i]);
                    }
                    
                    bandera = true;
                }
            }
        }
    }
    
}
