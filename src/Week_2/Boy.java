/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_2;

/**
 *
 * @author Josue Gavidia
 */
public class Boy extends Persona {
    String company;

    public Boy(String company, String name, int age) {
        super(name, age);
        this.company = company;
    }
    
    public String quienSoy()
    {
        return super.quienSoy()+"\nMe llamo Josue";
    }
    
    public String test(){
        return "Esto no se puede ver en upcasting";
    }
}
