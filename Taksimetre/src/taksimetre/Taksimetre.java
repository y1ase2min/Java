/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetre;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class Taksimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Taksimetre
        Scanner scan = new Scanner(System.in);
        System.out.println("km verisini giriniz:");
        double km = scan.nextInt();
        double acılıs= 10 ;
        //km * 2.20
        double ücret =  acılıs + (km*2.20);
           if( ücret < 20){
            ücret = 20;    
        }
        
        System.out.println("toplam ücret :" +ücret);
        
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}








