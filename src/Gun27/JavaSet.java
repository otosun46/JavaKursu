/*
Author:Otosun
Tarih :30/06/2020
*/
package Gun27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class JavaSet {
    public static void main(String[] args) {
        TreeSet<Integer> rakamlar = generateSet();  // 10 tane random rakamla doldursun
        System.out.println("rakamlar = " + rakamlar);
        System.out.println("rakamlar.size() 1= " + rakamlar.size());

        addElements(rakamlar, 10, 100, 100);
        addElements(rakamlar, 50);

        System.out.println("rakamlar = " + rakamlar);
        System.out.println("rakamlar.size() 2= " + rakamlar.size());

        int[] ints = convertToArray(rakamlar);
        System.out.println("Arrays.toString"+Arrays.toString(ints));
    }

    public static int[] convertToArray(TreeSet<Integer> set) {
        int[] yeni = new int[set.size()];
        int i=0;
        for (Integer sayi : set) {
            yeni[i] = sayi;
            i++;
        }
        return yeni;
    }

    public static void addElements(TreeSet<Integer> set, int... values) {
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
    }

    public static TreeSet<Integer> generateSet() {
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() < 10) {
            int randomSayi = (int) (Math.random() * 100 + 1);
            set.add(randomSayi);
        }
        return set;
    }
    /*
    public static HashSet<Integer> generateSet(){
        HashSet<Integer> set=new HashSet<>();
        while (set.size()<10) {
            int randomSayi= (int)(Math.random()*100+1);
            set.add(randomSayi);
        }
        return set;
    }

     */
}
