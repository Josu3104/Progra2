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
public abstract class BlockBusterItem {
    protected int codigo;
    protected String nombre;
    protected double precioRenta;
    Calendar fechaAddition;

    public BlockBusterItem(int codigo, String nombre, double precioRenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioRenta = precioRenta;
        fechaAddition = Calendar.getInstance();
    }

    @Override
    public String toString() {
        return "Codigo: "+codigo+"- Nombre: "+nombre+"- Precio de Renta: "+precioRenta;
    }
    
    public abstract double pagoRenta(int dias);
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }

    public Calendar getFechaAddition() {
        return fechaAddition;
    }

    public void setFechaAddition(Calendar fechaAddition) {
        this.fechaAddition = fechaAddition;
    }
    
    
    
    
    
}
