/*
Author:Otosun
Tarih :14/07/2020
*/
package Gun37.instanceModifiers.privateModifier.same;

public class Person {
    int id;
    String name;
    String userName;
   private String password;
//personel.password ="1234";
    //burası private olduğundan direk erişilemez

    public void SifreBelirle(String sifre){
        if (sifre.length()>=8)
        {
            this.password = sifre;
        }
        else
        {
            System.out.println("en az 8 karakter olmalı");
        }
    }

    public void SifreGoster() {
        if (this.password != null) {
            System.out.println("****" + this.password.substring(4));
        }
    }
}
