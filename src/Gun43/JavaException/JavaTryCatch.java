/**
 * @Author:Otosun Tarih :22/07/2020
 */
package Gun43.JavaException;

import java.time.LocalDate;
import java.time.Month;

public class JavaTryCatch {
    public static void main(String[] args) {
        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate date = LocalDate.of(2018, Month.APRIL, 4);
            System.out.println(" işlem tamam");
        } // hatanın bittiği yerde parantez kapatılır
        catch(Exception hata) // hata olduğunda yapılacak işlemler burdan aşağıda parantez arasına yazılır.
        {
            // hata olduğunda en yazpılacağı buraya yazılıyor.
            System.out.println("hata oldu");
            System.out.println("hata: " +   " tarih dönüşüm hatası");

        }

        System.out.println("Programın sonuna kadar gelindi.");

        try{
            // Java Öğren
        }
        catch(Exception hata){
            // anlaşılamadı
            // hızlıca konuları tekrar et
            // zaman az
        }

        // Sonunda inş iyi bir meslek ve kazanç seni bekliyor.

    }
}
