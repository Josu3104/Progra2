/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK_1;

/**
 *
 * @author Josue Gavidia
 */
public class FuncionesRecursivas {
    
    public static int sumatoriaUP(int num){
        if(num>=1)
            return sumatoriaUP(num-1)+num;
        return 0;
    
    }
    
    private static int sumatoriaDOWN(int num, int total){
        if(num>=1)
            return sumatoriaDOWN(num-1,total+num);
        return total;
    }
    
    public static int sumatoriaDOWN(int num){
        return sumatoriaDOWN(num,0);
    }
    
    private static boolean esPali(String palabra,int posInicio, int posFin){
        if(posFin>=posInicio){
            if(palabra.charAt(posInicio)==palabra.charAt(posFin))
                return esPali(palabra,posInicio+1,posFin-1);
            
            return false;
        }
        return true;
    }
    
    public static boolean esPali(String palabra){
        return esPali(palabra,0,palabra.length()-1);
    }
    
//    *
//    **
//    ***
//    ****
//    *****
    
    
    public static void piramide(int row, int col,int base){
        if(row<=base){
            System.out.println("*");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        String p = "alo";
        esPali(p,0,p.length()-1);
        System.out.println(esPali(p,0,p.length()-1));
        
    }
}
