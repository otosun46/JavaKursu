/*
Author:Otosun
Tarih :01/07/2020
*/
package Gun28;

import java.util.*;

/*
// Create method that generates a HashSet of
        // given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.
        // -Sonra AddElements şeklind ebir metodlar 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.
        // -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek
        // main de bir Array e eşitleyiniz.
        // -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek
        // main de bir ArrayList e eşitleyiniz.
 */
public class Task1 {
    public static void main(String[] args) {
//       Set<Integer> hs=generateSet();
//       AddElements(hs,11,15,25,34);
//        System.out.println(hs);
        HashSet<Integer> deneme = new HashSet<>();
        ArrayList<Integer> deneArLst = new ArrayList<>();
        Set<Integer> hs = generateSet();
        AddElements((HashSet<Integer>) hs, 2, 5, 8, 12, 25);

        System.out.println(hs);
        deneme.add(123);
        ArrayList<Integer> den1 = convertToArrayList(deneme);
        System.out.println(den1);

        System.out.println(convertToArray(deneme).toString());
    }

    public static HashSet<Integer> generateSet1() {
        HashSet<Integer> setLst = new HashSet<>();
        return setLst;
    }

    public static void AddElements(HashSet<Integer> hset, int... sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            hset.add(sayilar[i]);
        }
    }


        public static int[] convertToArray(HashSet<Integer> hset){

            int[] dizi=new int[hset.size()];
                    hset.toArray();


            return dizi;//
        }

    public static ArrayList<Integer> convertToArrayList(HashSet<Integer> hset) {
        ArrayList<Integer> arrLst = new ArrayList<>(hset);

        return arrLst;
    }


    public static Set<Integer> generateSet() {
        Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        return hs;
    }

    public static void AddElements(Set<Integer> st, int... sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            st.add(sayilar[i]);
        }
    }


}
