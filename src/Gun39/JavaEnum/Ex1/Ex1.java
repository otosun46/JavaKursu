/*
Author:Otosun
Tarih :16/07/2020
*/
package Gun39.JavaEnum.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        // verilen ay nosuna göre ayın kaç gün olduğunu yazdırnız.

        //int   sayi = 5; gibi.
        Aylar ay =Aylar.MART;
        System.out.println("ay = " + ay); // ay = MART
        System.out.println("ay.name() = " + ay.name()); // ay.name() = MART
        System.out.println("ay.ordinal() = " + ay.ordinal()); // ay.ordinal() = 2

        switch (ay)
        {
            case OCAK:
                System.out.println(31);
                break;

            case SUBAT:
                System.out.println(28);
                break;

            case MART:
                System.out.println(30);
                break;

            case NISAN:
                System.out.println(31);
                break;

            case MAYIS:
                System.out.println(30);
                break;
        }

    }
}
