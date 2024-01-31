/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_2;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class CuentaAhorro extends cuentaBancaria {
    private Calendar ultimaModif;
    public static final double TASA_AHORRO = 0.03;

    public CuentaAhorro(int nCuenta, String cliente) {
        super(nCuenta,cliente,TASA_AHORRO);
        ultimaModif = Calendar.getInstance();
    }

    public Calendar getUltimaModif() {
        return ultimaModif;
    }
    public boolean status()
    {
        Calendar hoy = Calendar.getInstance();
        hoy.add(Calendar.MONTH, -6);
        return hoy.before(ultimaModif);
    }
    @Override
    public String toString(){
        return super.toString()+"Status: ";
    }
    
    @Override
    public boolean retirar(double monto)
    {
        if(status()){
            return super.retirar(monto);
        }
        return false;
    }
    
    @Override
    public void depositar(double monto)
    {
        if(!status())
        {
            monto-=monto*0.1;
        }
        super.depositar(monto);
    }

   
    
    
}
