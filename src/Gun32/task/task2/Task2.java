/*
Author:Otosun
Tarih :07/07/2020
*/
package Gun32.task.task2;

/**
 * 1. Ayri dosyada olmak uzere Customer isimli fields:name bir class tanimlayiniz
 * 2. ayri bir dosyada ElectricityAccount isimli fields: totalKw, rate,bill
 * 3. Customer a bir ElectricityAccount ekleyiniz
 * 4. 1 tane musteri olusturunuz Account u dahil
 * 5. musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz
 *    tuketimEkle
 * 6. Odenecek rakami toplam tuketimi rate ile carparak hesaplatiniz yazdiriniz
 */

public class Task2 {
    public static void main(String[] args) {
        Customer musteri=new Customer();
        musteri.name="Kaya";
        musteri.electricityAccount=new ElectricityAccount();
        musteri.electricityAccount.tuketimEkle(100);
        musteri.electricityAccount.tuketimEkle(150);
        System.out.println("musteri.electricityAccount.totalKw = " + musteri.electricityAccount.totalKw);
        System.out.println("musteri.electricityAccount.tolalBill() = " + musteri.electricityAccount.tolalBill());


    }
}
