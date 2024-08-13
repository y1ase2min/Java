/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayi.sıralama;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class SayiSıralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz:");
        int a = scan.nextInt();
        
        System.out.println("2.sayiyi giriniz:");
        int b = scan.nextInt();
        
        System.out.println("3.sayiyi  giriniz:");
        int c = scan.nextInt();
        
        if(a>b && a>c){
            
            if (b>c){
                System.out.println("a>b>c");
            }
            else {
                System.out.println("a>c>b");
            }
            
        }
        if(b>a && b>c){
            
            if(a> c){
                System.out.println("b> a >c ");
                }
            else {
                System.out.println("b >c > a");
            }
            
        }
        if (c>a && c>b ){
            
            if (a>b){
                System.out.println("c>a>b");
            }
            else {
                System.out.println("c>b>a");
            }
        }
    }
    
}
