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

}
