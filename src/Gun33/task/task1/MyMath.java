/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.task.task1;



public class MyMath {




    public static double usAlma(double a, double b) {
        return Math.pow(a,b);
    }

    /**
     * Parametre olarak girilen max degerine kadar rastgele sayi dondurur.
     * @param max
     * @return
     */
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
    public static int toplama(int s){

        if (s>0){
            return s+toplama(s-1);
        }
        else return 0;
    }

    /**
     * Parametre olarak girilen min ve max degerleri arasinda rastgele sayi dondurur
     * @param min
     * @param max
     * @return
     */
    public static int randomNum(int min, int max) {
        int value = 0;
        value = (int) (Math.random() * (max - min) + min + 1);
        return value;
    }
    /**
     * Parametre olarak girilen degerin faktoriyelini dondurur.
     * Recursive bir metodtur.
     * @param sayi
     * @return
     */
    public static int faktoriyel(int sayi){
        if(sayi!=0){
            return sayi*faktoriyel(sayi-1);
        }
        else return 1;
    }
}