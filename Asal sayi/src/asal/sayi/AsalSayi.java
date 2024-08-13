/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asal.sayi;

/**
 *
 * @author Yasemin
 */
public class AsalSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi = 56;
        int i;
        for(i=2;i<sayi;i++){
           if(sayi % 2 == 0){
               System.out.println("sayi asal değildir.");
           }
           else {
               System.out.println("sayi asaldir");
           }
    }
    
}
