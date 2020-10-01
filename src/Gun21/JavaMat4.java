/*
Author:Otosun
Tarih :22/06/2020
*/
package Gun21;

import java.util.Arrays;
import java.util.Scanner;

/*
      Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük ve
      en küçük öğeler arasındaki farkı return edin.
      Not: the built-in    Math.min(v1, v2) ve   Math.max(v1, v2)
      methodları en küçük ve en büyük öğeleri return eder.


    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9

    return tipi  int dir
 */
public class JavaMat4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Diziyi string olarak giriniz:");
        String myStr = scan.nextLine();

        String[] strArr = myStr.split(" ");

        int[] useThisArray = new int[strArr.length];

        for(int i = 0 ; i< strArr.length ; i++){

            int num =Integer.parseInt(strArr[i]);
            useThisArray[i] = num;
        }
        //1.yöntem
        int min=useThisArray[0],max=useThisArray[0];
        
        for (int j = 0; j < useThisArray.length; j++) {
            if (min > useThisArray[j]) {
                min = useThisArray[j];
            }
            if (max < useThisArray[j]) {
                max = useThisArray[j];
            }
        }
        //2.Yöntem
        int fark=max-min;
        System.out.println("Fark  = " + fark);


        Arrays.sort(useThisArray); // küçükten büyüğe sıraladık
        int fark1 = useThisArray[useThisArray.length-1] - useThisArray[0]; // son elemandan ilk eleman çıkarılır
        System.out.println("Fark1 = "+fark1);

        //3.Yöntem
        int enBuyuk=useThisArray[0];
        int enKucuk=useThisArray[0];

        for(int i=0; i< useThisArray.length;i++)
        {
            enKucuk = Math.min(enKucuk, useThisArray[i]);  // Math.min fonksiyonu verilen 2 değerden küçük olanı verir.
            enBuyuk = Math.max(enBuyuk, useThisArray[i]); // Math.max fonksiyonu verilen 2 değerden büyük olanı verir.
        }

        System.out.println("Fark2 = " +  (enBuyuk-enKucuk));
    }

}
