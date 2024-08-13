/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziler2;

/**
 *
 * @author Yasemin
 */
public class Diziler2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] myList = {2.3,5.9,4.7,1.3};
        double total= 0 ;
        double max = myList[0];
        for (double number : myList){
           if (max <number ){
               max= number;
               }
            total= total +number;
            System.out.println(number);
       }
        System.out.println("En büyük sayi=" +max);
        System.out.println("sayilarin toplami=" +total);
    }
    
}
