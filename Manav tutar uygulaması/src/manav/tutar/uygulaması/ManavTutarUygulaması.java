/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manav.tutar.uygulaması;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class ManavTutarUygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Manav uygulamasi 
        double domates = 0.95;
        double salatalık =3.14;
        double kabak =2.22;
        double elma =4.11;
        double patlican =7.00;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("domates miktarini giriniz:");
        double domateskilo = scan.nextInt();
        
        System.out.println("salatalık miktarini giriniz:");
        double salatalıkkilo = scan.nextInt();
        
        System.out.println("elma miktarini giriniz:");
        double elmakilo = scan.nextInt();
        
        System.out.println("kabak miktarini giriniz:");
        double kabakkilo = scan.nextInt();
        
        System.out.println("patlican miktarini giriniz:");
        double patlicankilo = scan.nextInt();
         
        // toplam tutarin hesaplanmasi
        double tutar = (salatalık * salatalıkkilo)+(domates*domateskilo)+(kabak*kabakkilo)+
        (elma*elmakilo)+(patlican*patlicankilo);
        
        
       System.out.println("alişveriş tutari :" +tutar);
       
        
        
        
    }
    
}
