/*
Author:Otosun
Tarih :30/06/2020
*/
package Gun27;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer> setB=new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(4);
        setA.add(3);
        setA.add(5);
        setA.add(6);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(7);
        setB.add(8);

        System.out.println(birlestir(setA,setB));
        System.out.println(farkBul(setA,setB));
    }

    public  static HashSet<Integer> birlestir(HashSet<Integer> a,HashSet<Integer> b){
        HashSet<Integer> birlesik=new HashSet<>();
        birlesik.addAll(a);
        birlesik.addAll(b);
        return birlesik;

        //a.addAll(b);  //bu sekilde de calisiyor
        //return a;
    }

    public  static HashSet<Integer> farkBul(HashSet<Integer> a,HashSet<Integer> b) {
        //HashSet<Integer> fark = new HashSet<>(a);
        //fark.retainAll(b);
        a.retainAll(b);                     // comment yapilmis olanlar da calisiyor bu sekilde de calisiyor
        //return fark;
        return a;
    }
}
