/**
 * @Author:Otosun Tarih :27/07/2020
 */
package Gun46.example.ex2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba bentley = new Araba();

        bentley.setRenk("kirmizi");
        bentley.setModel("bentega");
        bentley.setMotor(4500);
        bentley.setKapiSayisi(2);

        Araba porsche = new Araba("mavi","991Turbo",3600,2);
        Araba toyota = new Araba("beyaz","camry",1600,-2);
        System.out.println(toyota.getKapiSayisi());

    }
}
