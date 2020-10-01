/*
Author:Otosun
Tarih :16/07/2020
*/
package Gun39.JavaEnum.Ex2;

public class Ex2Main {
    public static void main(String[] args) {
        /*
        User kullanici=new User();
        kullanici.name = "Alperen";
        kullanici.Role=1;
        kullanici.Status=2;

        User kullanici2=new User();
        kullanici.name = "Cigdem";
        kullanici.Role=1;
        kullanici.Status=1;
         */
        User kull1=new User();
        kull1.name = "Alperen";
        kull1.yetkisi=Role.ADMIN;
        kull1.durum=Status.ACTIVE;

        User kull2=new User();
        kull1.name = "Ali";
        kull1.yetkisi=Role.CUSTOMER;
        kull1.durum=Status.INACTIVE;

        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.



    }
}
