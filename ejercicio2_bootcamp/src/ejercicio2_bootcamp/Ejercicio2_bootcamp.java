/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_bootcamp;

/**
 *
 * @author migue
 */
public class Ejercicio2_bootcamp {

    /**
     * @param args the command line arguments
     */
        static double precioConIVA(double precio){
        double IVA=0.21;
        double final1 = precio*IVA;
        double fin = final1+precio;
        
        return fin;
        
        
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(precioConIVA(100));
        
                
    }
    

    
}
