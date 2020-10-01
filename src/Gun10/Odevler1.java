/*
Author:Otosun
Tarih :06/06/2020
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
public class Odevler1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int currentSpeed = scan.nextInt();

        boolean isDriverLicenceAvailable = scan.nextBoolean();

        int ceza;

        if (currentSpeed >= 95) ceza = 500;
        else if (currentSpeed >= 85) ceza = 320;
        else if (currentSpeed >= 75) ceza = 150;
        else if (currentSpeed >= 55) ceza = 100;
        else ceza = 0;
        if (isDriverLicenceAvailable == false) ceza = ceza + 200;
        System.out.println(ceza);
    }
}
