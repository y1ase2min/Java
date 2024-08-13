/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.pkgcase;

/**
 *
 * @author Yasemin
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // switch case ile geçme kalma durumu hesaplama 
        char harf = 'H';
        
        switch(harf){
            case 'A':
                System.out.println("mükemmel : geçtiniz");
                break;
            case 'B':
                System.out.println("Tebrikler: gectiniz");
                break;
            case 'C':
                System.out.println("Güzel:geçtiniz");
                break;
            case 'D':
                System.out.println("Sartli geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz.");
 
       }
    }
    
}
