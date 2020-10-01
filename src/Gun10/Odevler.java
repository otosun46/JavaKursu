/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

/*
 Trafik cezasının değerini hesaplayın.

45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:

Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:

Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:

Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:

Ceza 500 $'dır.

ve ayrıca,

Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

*/

public class Odevler {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int quizScore= oku.nextInt();
        int midTermScore= oku.nextInt();
        int finalScore= oku.nextInt();
        char not;

       int ortalama= (quizScore+midTermScore+finalScore)/3;
       if (ortalama>=90) not='A';
       else if (ortalama>=70) not='B';
       else if (ortalama>= 50) not='C';
       else not='F';
        System.out.println("Notunuz "+not+" dir");
    }
}
