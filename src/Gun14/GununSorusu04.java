/*
Author:Otosun
Tarih :12/06/2020
*/
package Gun14;
/*
 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız
 */
public class GununSorusu04 {
    public static void main(String[] args) {
        int baslangic=1;
        int bitis=255;
        int x = baslangic;

        char harf;
        do{
            harf=(char)x;
            System.out.println(x+" = "+ harf);
            x++;
        }while (x>=baslangic && x<=bitis);
    }
}
