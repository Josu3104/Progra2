/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK_6;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Josue Gavidia
 */
public class FileTest {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        MiFile mf = new MiFile();
        int opcion = 0;

        do {
            System.out.println("""
                               1- Set Archivo/Folder
                               2- Ver info
                               3- Crear archivo
                               4- Crear Folder(Carpeta)
                               5- Borrar
                               6- Directorios
                               7- Viruloso
                               8- Salir
                               """);
            System.out.print("Elija su opcion: ");
            try {
                opcion = lea.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Direccion: ");
                        mf.setFile(lea.next());
                        break;
                    case 2:
                        mf.info();
                        break;
                    case 3:
                        if (mf.crearFile()) {
                            System.out.println("Se creo!");
                        } else {
                            System.out.println("No se creo");
                        }
                        break;
                    case 4:
                        if (mf.crearFolder()) {
                            System.out.println("Se creo el Folder");
                        } else {
                            System.out.println("No se creo Folder");
                        }
                        break;
                    case 5:
                        if(mf.borrar()){
                            System.out.println("Te cargaste la base de datos");
                        }else{
                            System.out.println("No se borro :(");
                        }
                        break;
                    case 6:
                        mf.dir();
                        break;
                    case 7:
                        mf.viruloso();
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error");
            } catch (NullPointerException e) {
                System.out.println("SELECCIONE LA PRIMERA OPCION");
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una opcion valida");
                lea.next();
            }
        } while (opcion != 6);
    }

}
