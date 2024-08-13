/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sıcaklık.etkinlik;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class SıcaklıkEtkinlik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        System.out.println("sıcaklık bilgisi giriniz:");
        double sicaklik = scan.nextInt();
        
        if(sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if(5< sicaklik && sicaklik <= 15){
            System.out.println("Tiyatro yapabilirsiniz.");
         }
        if(15< sicaklik && sicaklik <=25){
            System.out.println("Mangal yapabilirisiniz.");
             }
        if (sicaklik > 25 ){
            System.out.println("yüzme yapabilirsiniz.");
        }
       
        
    }
    
}
