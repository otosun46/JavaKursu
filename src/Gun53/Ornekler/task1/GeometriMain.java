/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.task1;

public class GeometriMain {
    public static void main(String[] args) {

        Cember cember=new Cember(5);
        Dikdortgen dd=new Dikdortgen(5,7);
        Kare kare=new Kare(8);

        System.out.println("Cember alani="+cember.alani());
        System.out.println("Cember cevresi="+cember.cevresi());
        System.out.println("dd alani="+dd.alani());
        System.out.println("dd cevresi="+dd.cevresi());
        System.out.println("kare alani="+kare.alani());
        System.out.println("kare cevresi="+kare.cevresi());

    }
}
