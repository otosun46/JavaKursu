/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek2;

public class SekilMain {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen(8,6);
        Cember cember=new Cember(4);

        System.out.println(dikdortgen.Alan());
        System.out.println(dikdortgen.Cevre());
        System.out.println(cember.Alan());
        System.out.println(cember.Cevre());
        System.out.println(dikdortgen.toString());
        System.out.println(cember.toString());
       // System.out.printf("Adi: %s\n Cevresi: %f \n Alani: \n",getName,Cevre(),Alan());
    }
}
