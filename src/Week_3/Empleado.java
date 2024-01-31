/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public abstract class Empleado implements Serializable {
    SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY");
    protected int codigo;
    protected String nombre;
    protected Calendar contratacion;

    public Empleado(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        contratacion = Calendar.getInstance();
    }

    public final int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public final String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Funciones abstractas
    public abstract double pagar();
    public abstract double bono();
    
    
    @Override
    public String toString(){
        return "Empleado {Codigo: "+codigo+", Nombre: "+nombre+", Fecha Contratacion: "+format.format(contratacion.getTime());
    }
    
   
}
