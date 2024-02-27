/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK_7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

/**
 *
 * @author Josue Gavidia
 */
public class EmpleadosAdmin {

    private RandomAccessFile rcods, remps;

    public EmpleadosAdmin() {
        //1 -Asegurar que el folder company 
        try {
            File mifile = new File("Company");
            mifile.mkdir();
            //2 - Instanciar los RAFS dentro del folder
            rcods = new RandomAccessFile("Company/codigos.emp", "rw");
            remps = new RandomAccessFile("Company/empleados.emp", "rw");
            //3 - Inicializar el archivo de codigos, si es el primer registro
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    
    private void initCodes()throws IOException{
        if(rcods.length()==0){
            rcods.writeInt(1);
        }
    }
    
    private int getCode()throws IOException{
       rcods.seek(0);
       int code = rcods.readInt();
       rcods.seek(0);
       rcods.writeInt(code+1);
       return code;
       
    }
    /*
    Formato
    int code
    String name
    double salary
    Long DateC
    Long DateF
*/
    public void addEmployee(String name, double salary) throws IOException{
        remps.seek(remps.length());
        remps.writeInt(this.getCode());
        remps.writeUTF(name);
        remps.writeDouble(salary);
        remps.writeLong(new Date().getTime());
        remps.writeLong(0);
        //Crear folder individual
        
        
        
        
    }
    
    private String employeeFolder(int code){
        return "Company/empleado"+code;
        
    }
    
    private void createEmployeeFolders(int code){
        //Crear el folder del empleado
        File edir = new File(this.employeeFolder(code));
        edir.mkdir();
        //Crear los archivos por año
        
        
        
    }

}
