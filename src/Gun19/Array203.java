/*
Author:Otosun
Tarih :18/06/2020
*/
package Gun19;

import java.util.Arrays;

public class Array203 {
    public static void main(String[] args) {
        String[] dizi = {"ahmet","mehmet","ali","hasan"};
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] c={2,3,1};

        System.out.println("a==b :"+Arrays.equals(a,b));
        System.out.println("a==c :"+Arrays.equals(a,c));

        int[] numbers=new int[5];
        System.out.println("Atamadan once dizi : "+Arrays.toString(numbers));
        Arrays.fill(numbers,8);
        System.out.println("Atamadan sonra dizi: "+Arrays.toString(numbers));


        // Arrays.binarySearch(array, value) SIRALI bir dizide aranan değer var ise
        // index ini veriri, yok ise - değer döndürür.

        int[] rakamlar={2,7,4,13,8,12,6,3};

        System.out.println("Siralamadan önce : 8 in indexi= "+ Arrays.binarySearch(rakamlar,8));
        Arrays.sort(rakamlar);
        System.out.println("Siralamadan sonra : 8 in indexi= "+ Arrays.binarySearch(rakamlar,8));
    }
}
