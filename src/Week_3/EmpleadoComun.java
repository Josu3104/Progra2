/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

/**
 *
 * @author Josue Gavidia
 */
public class EmpleadoComun extends Empleado implements Empleable {

    protected double salario;

    public EmpleadoComun(int codigo, String nombre, double salary) {
        super(codigo, nombre);
        salario = salary;
    }

    @Override
    public double pagar() {
        return salario - deduct();

    }

    @Override
    public double bono() {
        return 0;
    }

    @Override
    public void increaseIncome() {
        if (validForIncrease()) {
            salario += salario * 0.1;
        }
    }

    @Override
    public boolean validForIncrease() {
        return true;
    }

    @Override
    public double deduct() {
        return salario * Deductible.TASA_DEDUCCION;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario: " + salario;
    }

    @Override
    public void Test() {
        System.out.println("");

    }
    
  

}
