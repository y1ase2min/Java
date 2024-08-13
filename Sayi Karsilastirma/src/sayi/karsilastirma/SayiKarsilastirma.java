/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayi.karsilastirma;

/**
 *
 * @author Yasemin
 */
public class SayiKarsilastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En büyük sayiyi bulma 
        int sayi1= 21;
        int sayi2=23;
        int sayi3=13;
        int Enb= sayi1;
        // Karşılaştırma Kısmı 
        if(Enb < sayi2){
           Enb = sayi2;
        }
        if(Enb < sayi3){
            Enb=sayi3;
        }
        System.out.println("en büyük sayi:" +Enb);
       
    }
    
}
}
    
}
