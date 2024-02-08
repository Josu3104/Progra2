/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_4;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class MovieItem extends BlockBusterItem {

    String estado;

    public MovieItem(int codigo, String nombre, double precioRenta) {
        super(codigo, nombre, precioRenta);
        estado = "ESTRENO";
    }

    @Override
    public String toString() {
        return super.toString() + "- Estado: " + estado + "- Movie";
    }

    @Override
    public double pagoRenta(int dias) {
        if (estado.equals("ESTRENO") && dias > 2) {
            return dias * 50;
        } else if (estado.equals("NORMAL") && dias > 5) {
            return dias*30;
        }
        return -1;
    }
    
    public void evaluarEstado(){
        Calendar fechaFutura = this.fechaAddition;
        fechaFutura.add(Calendar.MONTH,5 );
        if(this.fechaAddition.before(fechaFutura)){
            this.estado = "NORMAL";
        }
    }

}
