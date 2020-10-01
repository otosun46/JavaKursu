/*
Author:Otosun
Tarih :25/06/2020
*/
package Gun24;
/*
% c karakteri
% d ondalık (tam sayı) sayı (taban 10)
% e üstel kayan nokta sayısı
% f kayan nokta sayısı
% i tamsayı (taban 10)
% o sekizli sayı (taban 8)
% s Dize
% u işaretsiz ondalık (tamsayı) sayı
Onaltılık olarak % x sayı (taban 16)
% t format tarih / saat
%% yüzde işareti yazdır
\% yüzde işareti yazdır

 */
public class JavaPrintAndFormat {
    public static void main(String[] args) {
        int a=120;
        double oran=0.25652346785;
        String str;

        System.out.println("a = " + a);
        System.out.println("oran = " + oran);

        // Formatlı yazdırmalar :  Format ve printf
        // tam sayılar içid : d
        // ondalıklı sayılar için : f  kullanılıyor

        str = String.format(" a=%d   oran=%f ", a,oran);
        System.out.println("1.str = " + str);
        System.out.println(" a="+a+" oran="+oran); // ama ben noktadan sonra 2 hane yazsın gibi yazdırmazdım

        System.out.printf("2. a=%d oran=%f , pi=%f \n", a,oran, Math.PI);
        System.out.printf("3. a=%10d oran=%f \n", a,oran); // 10d 10 hane kullan
        System.out.printf("4. a=%-10d oran=%f \n", a,oran); // 10d 10 hane kullan ama sola dayalı yaz
        System.out.printf("5. a=%010d oran=%f \n", a,oran); // 10d 10 hane kullan, ama boş halere 0 ata

        System.out.printf("6. a=%d oran=%.3f \n", a,oran); // noktadan sonra 3 hane kullan
        System.out.printf("7. a=%d oran=%.9f \n", a,oran); // noktadan sonra 9 hane kullan
        System.out.printf("8. a=%d oran=%6.1f \n", a,oran); // 6 hane kullan noktadan sonra 1 tane olsun
    }
}
