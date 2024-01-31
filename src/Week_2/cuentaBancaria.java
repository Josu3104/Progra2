/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */

public class cuentaBancaria {
    protected int nCuenta;
    protected String cliente;
    protected double saldo;
    protected double tasa;
    protected Calendar creacion;
    private SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYY");

    public cuentaBancaria(int nCuenta, String cliente, double tasa) {
        this.nCuenta = nCuenta;
        this.cliente = cliente;
        this.tasa = tasa;
        saldo = 500;
        creacion = Calendar.getInstance();
        
        
    }
    
    public boolean retirar(double monto){
        if(saldo>monto)
        {
            saldo-=monto;
            return true;
        }
        return false;
    }
    
    public void depositar(double monto){
        if(monto>0)
        {
            saldo+=monto;
            JOptionPane.showMessageDialog(null, "Se ha depositado");
        }
    }
    
    @Override
    public String toString()
    {
        return "Numero de cuenta: "+nCuenta+"\nSaldo: "+saldo+"Tasa: "+tasa;
    }
    
    
    
}
