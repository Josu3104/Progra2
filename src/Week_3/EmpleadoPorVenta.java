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
public final class EmpleadoPorVenta extends EmpleadoComun {

    private double ventas[], tasa;

    public EmpleadoPorVenta(int codigo, String nombre, double salary) {
        super(codigo, nombre, salary);
        ventas = new double[12];
        tasa = 0.05;
    }

    private int mesActual() {
        Calendar mes = Calendar.getInstance();
        return mes.get(Calendar.MONTH);
    }

    public void addVenta(double monto) {
        ventas[mesActual()] += monto;
    }

    public double addComision() {
        return ventas[mesActual()] * tasa;

    }

    @Override
    public double pagar() {
        return super.pagar() + addComision();
    }

    @Override
    public String toString() {
        return super.toString() + ", comision: " + addComision();
    }

    @Override
    public void increaseIncome() {
        if (tasa < 0.2) {
            tasa += 0.1;
        }
    }

}
