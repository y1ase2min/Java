/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenüs;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class Hipotenüs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("1. kenari giriniz:");
        double a = scan.nextInt();
        System.out.println("2. kenari giriniz:");
        double b = scan.nextInt();
        
        // Karekök hesaplama için math.sqrt fonksiyonu kullanılır
        double c = Math.sqrt((a*a)+(b*b)); 
        System.out.println("Kenarlarin hipotenüsü:" +c);
        
        
    }
    
}
