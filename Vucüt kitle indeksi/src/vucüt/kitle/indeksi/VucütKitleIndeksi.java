/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vucüt.kitle.indeksi;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class VucütKitleIndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vücut kitle indeksi hesaplama 
        Scanner scan = new Scanner (System.in);
        System.out.println("Boy bilginizi giriniz:");
        double boy = scan.nextDouble();
        System.out.println("kilo bilginizi giriniz:");
        double kilo = scan.nextDouble();
        
        double indeks = kilo /(boy*boy);
        
         System.out.println("Vücut kitle indeksiniz:" + indeks);
        
        if (indeks > 18){
            System.out.println("Kitle indeksiniz yüksek.");
        }
        if  ( indeks == 18 ){
            System.out.println("Kitle indeksiniz normal.");
    } 
        else{
            System.out.println("kitle indeksiniz düşük");
        }
        
       
        
        
    }
    
}
