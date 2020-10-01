/*
Author:Otosun
Tarih :14/07/2020
*/
package Gun37.instanceModifiers.privateModifier.same;

public class Company {
    public static void main(String[] args) {
        Person personel = new Person();
        personel.id = 1;
        personel.name = "Ahmet";
        personel.userName = "ahmet";
        //personel.password ="1234";
        //burası private olduğundan direk erişilemez

        personel.SifreBelirle("1abcd");
        personel.SifreGoster();

    }
}
