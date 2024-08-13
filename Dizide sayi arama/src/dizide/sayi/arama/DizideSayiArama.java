/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizide.sayi.arama;

/**
 *
 * @author Yasemin
 */
public class DizideSayiArama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,5,7,8,14,16};
        int aranan = 7;
        int i;
        for(i=0;i<sayilar.length;i++){
           if (aranan == sayilar[i]){
           System.out.println("aranan sayi bulunmuştur.");
           }
           
         
           
        else {
               System.out.println("aranan sayi bulunamamıştır");
           }   
        }
        
    }
    
}
