/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public final class EmpeladoTemporal extends EmpleadoComun {

    private Calendar finContrato;

    public EmpeladoTemporal(int codigo, String nombre) {

        super(codigo, nombre, 14000);
        finContrato = Calendar.getInstance();
    }

    @Override
    public double pagar() {
        Calendar hoy = Calendar.getInstance();
        if (hoy.before(finContrato)) {
            return super.pagar();
        }
        return 0;
    }

    public Calendar getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(int year, int mes, int dia) {
        Calendar fin = Calendar.getInstance();
        Calendar hoy = Calendar.getInstance();
        fin.set(year, mes, dia);
        if(fin.after(hoy))
        this.finContrato.set(year, mes, dia);
        
    }

    @Override
    public String toString() {
        return super.toString()+" fin contrato: "+finContrato.getTime();
    }
    
    

}
