/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun18;

public class ArrayTanimlama {
    public static void main(String[] args) {
        int[] dizi1=new int[5];
        int[] dizi2 ={2,5,7,10,52};
        String[] dizi3=new String[5];
        boolean[] dizi4=new boolean[5];
        double[] dizi5=new double[5];

        for (int i=0;i<dizi1.length;i++){
            System.out.println("dizi1 ["+i+"] =" + dizi1[i]);
        }
        for (int i=0;i<dizi2.length;i++){
            System.out.println("dizi2 ["+i+"] =" + dizi2[i]);
        }
        for (int i=0;i<dizi3.length;i++){
            System.out.println("dizi3 ["+i+"] =" + dizi3[i]);
        }
        for (int i=0;i<dizi5.length;i++){
            System.out.println("dizi4 ["+i+"] ="  + dizi4[i]);
        }
        for (int i=0;i<dizi5.length;i++){
            System.out.println("dizi5 ["+i+"] ="  + dizi5[i]);
        }
    }
}
