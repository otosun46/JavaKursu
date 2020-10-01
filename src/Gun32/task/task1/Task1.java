/*
Author:Otosun
Tarih :07/07/2020
*/
package Gun32.task.task1;

/**
 * 1. Rectangle isminde bir sinif yaziniz. fields:width,length
 * 2. Cevre bulmak uzere getPiremeter isminde bir metod olusturun
 * 3. Dikdortgenin alanini bulan getArea isimli bir metod yaziniz
 */

public class Task1 {
    public static void main(String[] args) {
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length=5;
        dikdortgen.width=4;

        System.out.println(dikdortgen.getPerimeter());
        System.out.println(dikdortgen.getArea());
    }
}
