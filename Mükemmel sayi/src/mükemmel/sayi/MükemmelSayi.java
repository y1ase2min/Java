/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mükemmel.sayi;

/**
 *
 * @author Yasemin
 */
public class MükemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sayi = 57;
       int i;
       int toplam =0;
       for(i=1; i<sayi;i++){
           if(sayi%i == 0){
               toplam=toplam+i;
           }
       }
       if(toplam == sayi){
           System.out.println("sayi mükemmel sayidir.");
       }
       else{
           System.out.println("sayi mükemmel sayi değildir");
       }
    }
    
}
