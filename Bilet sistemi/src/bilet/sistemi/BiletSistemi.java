/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilet.sistemi;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class BiletSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int km ;
      int yas;
      int yoltip;
      System.out.println("mesafe  bilgisini giriniz:");
      km = scan.nextInt();
      System.out.println("yas bilgisini giriniz:");
      yas = scan.nextInt();
      System.out.println("yolculuk tipini giriniz: 1 -> tek yön gidis 2-> gidis-dönüs:");
      yoltip = scan.nextInt();
      
      if (km <0 ){
          System.out.println("Hatali veri girdiniz.");
      }
      else if ( yas < 0){
          System.out.println("Hatal veri girdiniz.");
        }
      else if (yoltip != 1 && yoltip  != 2 ){
          System.out.println("Hatali veri girdiniz.");
          }
      else {
          System.out.println("Hesaplama yapılır.");
      }
      double biletücret = km * (0.10);
      double yasindirim = 0;
      
      if ( yas < 12){
          yasindirim = biletücret * 0.5;
      }
      else if (12< yas && yas < 24){
          yasindirim = biletücret * 0.1;
      }
      else if ( yas >65){
          yasindirim = biletücret * 0.3;
      } 
      else {
          System.out.println("Hatali veri girdiniz.");
      }
     biletücret= 
      
      
      
         
      
    }
    
}
