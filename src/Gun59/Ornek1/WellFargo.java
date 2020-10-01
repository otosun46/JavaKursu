/**
 * @Author:Otosun Tarih :18/08/2020
 */
package Gun59.Ornek1;

public class WellFargo extends Bank{
    public WellFargo(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    void openAccount() {
        System.out.println("Adiniz ve adres bilgileriniz alindi");
        System.out.println(this.getClass().getSimpleName()+" hesap acilisiniz yapildi...");
    }

    @Override
    void closeAccount() {
        System.out.println("Hesap kapatma talebiniz alinmistir");
        System.out.println(this.getClass().getSimpleName()+" da bulunan hesabiniz kapatildi");

    }
}
