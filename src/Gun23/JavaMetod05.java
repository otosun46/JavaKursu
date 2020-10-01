/*
Author:Otosun
Tarih :24/06/2020
*/
package Gun23;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMetod05 {
    public static void main(String[] args) {
        // 5 elemanlı bir diziyi kullanıcı doldurduktan sonra
        // bir fonksiyonda tek elemalara 0 değeri atayınız.
        // diziyi main de yazdırınınız.
        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print("Sayi giriniz=");
            dizi[i]=oku.nextInt();
        }
        System.out.println("Önce : " + Arrays.toString(  dizi )  );
        System.out.println("Sonra : " +  Arrays.toString(  teklereSifirAta(dizi)  )  );
    }

    public static int[] teklereSifirAta(int[] dizi)
    {
        // eğer dizinin elemanı tek ise 0 atanıyor
        for(int i=0;i<dizi.length;i++){
            if (dizi[i]%2 == 1)
                dizi[i]=0;
        }

        return dizi;
    }
}
