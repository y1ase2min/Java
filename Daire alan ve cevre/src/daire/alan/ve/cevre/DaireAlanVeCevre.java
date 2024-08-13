/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daire.alan.ve.cevre;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class DaireAlanVeCevre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dairede alan ve cevre
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz:");
        double r= scan .nextInt();
        // alan ve çevre hesabi
        double alan = Math.PI*r*r;
        double cevre = 2* Math.PI*r;
        
       System.out.println("Dairenin alani =" +alan );
       System.out.println("Dairenin cevresi =" +cevre);
      
    }
    
}
