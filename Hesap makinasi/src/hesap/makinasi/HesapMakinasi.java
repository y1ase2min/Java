/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesap.makinasi;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class HesapMakinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hesap makinesi
        Scanner scan = new Scanner (System.in);
        System.out.println("1. sayiyi giriniz:");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayiyi giriniz:");
        int sayi2= scan.nextInt();
        
        System.out.println("islem seciniz:");
        System.out.println("1-toplama");
        System.out.println("2-cıkarma");
        System.out.println("3-carpma");
        System.out.println("4-bölme");
        System.out.println("isleminiz:");
        int secim = scan.nextInt();
      
        if (secim == 1){
            System.out.println("sonuc:" + (sayi1+sayi2));
        }
        if (secim == 2){
            System.out.println("sonuc:" + (sayi1-sayi2));
        }
        if (secim == 3){
           System.out.println("sonuç:" +  (sayi1*sayi2));
        }
        if (secim == 4){
            if(sayi2 == 0){
                System.out.println("bölen 0 olamaz.");
            }
            else{
                System.out.println("sonuc:" + (sayi1/sayi2));
            }
             
        }
     
        
        
        
    }
    
}
