/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cin.zodyagi;

/**
 *
 * @author Yasemin
 */
import java.util.Scanner;
public class CinZodyagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        System.out.println("Dogum yilinizi griniz :");
        int yil = scan.nextInt();  
        
        if(yil % 12 == 0){
            System.out.println("Zodyak burcu Maymun.");
        }
        else if(yil % 12 == 1){
            System.out.println("Zodyak burcu Horoz.");
        }
        else if (yil % 12 == 2){
            System.out.println("Zodyak burcu Köpek.");
        }
        else if (yil % 12 == 3){
            System.out.println("Zodyak burcu Domuz.");
        }
        else if (yil % 12 == 4){
            System.out.println("Zodyak burcu Fare.");
        }
        else if (yil % 12 == 5){
            System.out.println("Zodyak burcu Öküz.");
        }
        else if (yil % 12 == 6){
             System.out.println("Zodyak burcu Kaplan.");
        }
        else if (yil % 12 == 7){
             System.out.println("Zodyak burcu Tavsan.");
        }
        else if (yil % 12 == 8){
            System.out.println("Zodyak burcu Ejderha.");
        }
        else if (yil % 12 == 9){
            System.out.println("Zodyak burcu Yilan");
        }
        else if (yil % 12 == 10){
            System.out.println("Zodyak burcu  At");
        }
        else if (yil % 12 == 11){
            System.out.println("Zodyak burcu Koyun");
        }
        
        
        
        
    }
    
}
