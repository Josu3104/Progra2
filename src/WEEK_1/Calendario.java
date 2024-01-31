/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Josue Gavidia
 */
public class Calendario {

    public static void main(String[] args) {
       SimpleDateFormat fechaLive = new SimpleDateFormat("dd/MM/yyyy");
        Calendar hoy = Calendar.getInstance();
        System.out.println("Hoy: " + hoy.getTime());
        //Fecha Especifica
        Calendar Jbday = Calendar.getInstance();
        Jbday.set(2004, Calendar.MAY, 3);
        System.out.println("Ale nacio en : " + Jbday.getTime());
        
        Date fecha;
        fecha = new Date();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa"+fecha);
        fechaLive.format(fecha);
        System.out.println("Deito da  "+  fechaLive.format(fecha));
        //Comparar
        if (hoy.after(Jbday)) {
            System.out.println("Si hoy es despues del nacimiento de Ale");
        }

        if (Jbday.before(hoy)) {
            System.out.println("Si la fecha de hoy es antes del nacimiento de Ale");
        }

        if (hoy.getTimeInMillis() >= Jbday.getTimeInMillis()) {
            System.out.println("Si hoy paso despues de que Ale nacio");
        }
        
        //Valores individuales
        for(int i=0;i<4;i++){
            System.out.println("");
        }
            
            
      System.out.println("Año "+hoy.get(Calendar.YEAR));
        System.out.println("Dia de hoy "+hoy.get(Calendar.DAY_OF_YEAR));
        System.out.println("Mes "+hoy.get(Calendar.MONTH));
        
        //Añadir o quitar
        hoy.add(Calendar.YEAR, 2);
        hoy.add(Calendar.MONTH, -6);
        System.out.println("Hoy en 2 años 6 meses atras: "+hoy.getTime());
        
        //Comprobar la fecha de nacimiento 
        Calendar hace = Calendar.getInstance();
        hace.add(Calendar.YEAR, -19);
        if(hace.after(Jbday))
            System.out.println("Han pasado 19 años desde que nacio Ale");
        System.out.println("Mes de Ale: "+
                Jbday.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
//+"/n Dia de Hoy: "+hoy.get(Calendario.DAY_OF_WEEK_IN_MONTH)+"/nDay of week"+
//                hoy.get(Calendario.DAY_OF_WEEK)+"/nDay of week in month"+hoy.get(Calendario.DAY_OF_WEEK_IN_MONTH)+"/nDay of month"+hoy.get(Calendario.DAY_OF_MONTH)+
//                "/nDay of year"+ hoy.get(Calendario.DAY_OF_YEAR));
        

    }

}
