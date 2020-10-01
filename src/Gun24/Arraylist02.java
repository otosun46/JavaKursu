/*
Author:Otosun
Tarih :25/06/2020
*/
package Gun24;

import java.util.ArrayList;

public class Arraylist02 {
    public static void main(String[] args) {

        ArrayList<String> list1=new ArrayList<>(){
            {
                add("Almanca");
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };
        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");
        System.out.println("list2 = " + list2);

        list1.removeAll(list2);
        System.out.println("list1 = " + list1);

    }
}
