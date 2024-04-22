/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hora;

/**
 *
 * @author alu_tarde
 */
public class HoraTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Hora h1=new Hora(0,25);
        h1.inc();
        h1.inc();
        h1.inc();
        h1.inc();
        h1.inc();
        h1.inc();
        h1.inc();
        h1.inc();
        System.out.println(h1.toString());
        System.out.println(h1.toString());
        
        HoraExacta h2= new HoraExacta(20,58,58);
        h2.inc();
        
        System.out.println(h2.toString());
        
        for (int i = 0; i < 3600; i++) {
            h2.inc();
        }
        System.out.println(h2.toString());
        Object p=h2;
        Object p2=h1;
        System.out.println(h2.equals(p2));
    }
}
