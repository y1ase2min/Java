/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asansor;


     // Asansör sınıfı
import java.util.Scanner;
public class Asansor {
    private int kat;
    private boolean hareketHalinde;
    private int kisi;

    public Asansor() {
        this.kat = 0; // Asansör başlangıçta zemin katta
        this.hareketHalinde = false; // Asansör başlangıçta hareket halinde değil
    }

    public void hareketEt(int hedefKat) {
            
        
        
        if (hareketHalinde) {
            System.out.println("Asansör zaten hareket halinde.");
            return;
        }

        if (hedefKat < 0 || hedefKat > 10) {
            System.out.println("Geçersiz hedef kat numarası.");
            return;
        }

        if (hedefKat == kat) {
            System.out.println("Asansör zaten bu katta.");
            return;
        }

        System.out.println("Asansör " + kat + ". kattan " + hedefKat + ". kata hareket ediyor.");
        hareketHalinde = true;
        kat = hedefKat;
        hareketiBitir();
    }

    private void hareketiBitir() {
        System.out.println("Asansör " + kat + ". kata ulaştı.");
        hareketHalinde = false;
    }

    // Asansörün bulunduğu katı döndüren metod
    public int getKat() {
        return kat;
    }

    // Asansörün hareket halinde olup olmadığını kontrol eden metod
    public boolean isHareketHalinde() {
        return hareketHalinde;
    }

    public static void main(String[] args) {
        Asansor asansor = new Asansor();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asansore binecek kisi sayısını giriniz:");
        int kisi = scanner.nextInt();
        if (kisi > 10){
            System.out.println("kisi sayisi 10'dan  fazla kapi kapanmıyor.");
            }

        // Asansörü kullanma örneği
       System.out.println("Gitmek istediginiz kati giriniz:");
       int kat = scanner.nextInt();
       
       if(kat > 8 || kat < 0){
           System.out.println("Gecersiz kat girdiniz");
       }

        // Bilgi kontrolü
        System.out.println("Asansör " + asansor.getKat() + ". katta.");
        System.out.println("Asansör hareket halinde mi? " + asansor.isHareketHalinde());
    }
      
    
}

    
    

