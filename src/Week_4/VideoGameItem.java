/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_4;

/**
 *
 * @author Josue Gavidia
 */
public class VideoGameItem extends BlockBusterItem {
    
    String consola;
    public static final String c1 = " PLAYSTATION";
      public static final String c2 = "XBOX";
        public static final String c3 = "WII";

    public VideoGameItem(String consola, int codigo, String nombre) {
        super(codigo, nombre, 30);
        this.consola = consola;
    }

    @Override
    public String toString() {
        return super.toString()+"- Consola: "+consola+" Game";
    }
    
    

    @Override
    public double pagoRenta(int dias) {
       return this.precioRenta*dias;
    }
    
    
    
    
    
}
