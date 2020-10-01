/*
Author:Otosun
Tarih :29/06/2020
*/
package Gun26;

import java.util.ArrayList;

public class Java2D_Arraylist {
    public static void main(String[] args) {
        /***********************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2 = new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList = new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        int[][] mat = new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<ArrayList<Integer>> notlarArrList = new ArrayList<>();
        // boşluklar gereksi sade gözükebilsin diye yapıldı.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);
        kimNotlar.add(81);

        notlarArrList.add(matNotlar); // burada tanımalamada neyin listesi ise ona uygun değişkeni Ekledik
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);
/*
        System.out.println(notlarArrList);
        for (int i = 0; i < notlarArrList.size(); i++) {
            System.out.println(notlarArrList.get(i));
        }
        for (int i = 0; i <notlarArrList.size() ; i++) {
            for (int j = 0; j < notlarArrList.get(i).size(); j++) {
                System.out.println(notlarArrList.get(i).get(j));
            }
        }
*/
        System.out.printf("%2.2f \n", ortalama(0, notlarArrList));
        System.out.printf("%2.2f \n", tumDersOrtalama(notlarArrList));
        System.out.println(sinavOrtalama(5, notlarArrList));

    }

    public static double ortalama(int dersNo, ArrayList<ArrayList<Integer>> notlar) {
        int toplam = 0;
        for (int i = 0; i < notlar.get(dersNo).size(); i++) {
            toplam += notlar.get(dersNo).get(i);
        }
        return toplam / notlar.get(dersNo).size();
    }

    public static double tumDersOrtalama(ArrayList<ArrayList<Integer>> notlar) {
        double tumToplam = 0;
        for (int i = 0; i < notlar.size(); i++) {
            tumToplam += ortalama(i, notlar);
        }
        return tumToplam / notlar.size();
    }

    public static int sinavOrtalama(int sinavNo, ArrayList<ArrayList<Integer>> notlar) {

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i).size() > sinavNo) {          //Buradaki if sorgusu okunacak notun indeksinin
                                                           // o arraylist buyuklugunden kucuk olmasina bakiyor
                toplam += notlar.get(i).get(sinavNo);
                sayac++;                                   //ortalamayi bulmak icin bu sayaci koymak zorundayiz
                                                           // dongunun if ifadesinin icine kac defa girdigini bulmak icin
            }
        }
        if (sayac == 0) sayac = 1;                           //sifira bolum hatasi vermemesi icin eklendi
        return toplam / sayac;
    }
}
