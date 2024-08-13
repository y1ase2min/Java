/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burc.hesaplama;

/**
 *
 * @author Yasemin
 */
import java .util.Scanner;
public class BurcHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int ay ;
        int gün;  
        System.out.println("dogdugunuz ayi girin :");
        ay = scan.nextInt();
        System.out.println("dogdugunuz günü girin:");
        gün = scan.nextInt();
        
        if (ay>0 && ay < 13){
            if (ay == 1){
                if (gün < 21){
                    System.out.println("oglak");
                }
                else {
                    System.out.println("kova");
                }
            }
            if ( ay == 2){
                if (gün < 19){
                    System.out.println("kova");
                }
                else {
                    System.out.println("balik");
                }
            }
            if ( ay == 3){
                if ( gün < 20 ){
                     System.out.println("balik");
                }
                else {
                    System.out.println("koc");
                }
            
            }
            if ( ay == 4){
                if (gün < 20){
                 System.out.println("koc");
            }
                else {
                 System.out.println("boga");
                }
            }
            if (ay == 5){
                if (gün < 20 ){
                    System.out.println("boga");
                }
                else {
                    System.out.println("ikizler");
                }
            }
            if ( ay == 6){
                if (gün < 21){
                    System.out.println("ikizler");
                }
                else{
                    System.out.println("yengec");
                }
            }
            if (ay == 7){
                if (gün < 22){
                    System.out.println("yengec");
                }
                else{
                    System.out.println("aslan");
                }
            }
            if (ay == 8){
                if (gün < 23 ){
                    System.out.println("aslan");
                }
                else{
                    System.out.println("basak");
                }
            }
            if (ay == 9){
                if ( gün <23){
                    System.out.println("basak");
                }
                else{
                    System.out.println("terazi");
                }
            }
            if (ay == 10){
                if (gün < 23){
                    System.out.println("terazi");
                }
                else{
                    System.out.println("akrep");
                }
            }
            if (ay == 11){
                if (gün < 22){
                    System.out.println("akrep");
                }
                else {
                    System.out.println("yay");
                }
            }
            if (ay == 12){
                if ( gün < 21){
                    System.out.println("yay");
                }
                else{
                    System.out.println("oglak");
                }
            }
        }
        else {
            System.out.println("gecersiz giris");
        }
    }
    
}
