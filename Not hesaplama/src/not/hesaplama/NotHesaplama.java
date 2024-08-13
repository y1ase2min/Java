Java.util.scanner
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package not.hesaplama;

import java.util.Scanner;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner
public class NotHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int matematik, fizik,türkce,tarih, müzik;
        
        System.out.println("fizik notunuz:");
        fizik = input.nextInt();
        
        System.out.println("matematik notunuz:");
        matematik = input.nextInt();
        
        System.out.println("türkce notunuz:");
        türkce = input.nextInt();
        
        System.out.println("tarih notunuz:");
        tarih =input.nextInt();
        
        System.out.println("müzik notunuz");
        müzik= input.nextInt();
        
        int toplam,ort;
        toplam= matematik + türkce + tarih + fizik + müzik;
        ort= toplam/5;
        System.out.println("Genel not ortalaması:" +ort);
        
        
    }
    
}
