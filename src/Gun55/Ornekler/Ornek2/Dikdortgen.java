/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek2;

public class Dikdortgen extends Sekil {
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        this.genislik=genislik;
        this.uzunluk=uzunluk;
    }

    @Override
    double Alan() {
        return uzunluk*genislik;
    }

    @Override
    double Cevre() {
        return (uzunluk+genislik)*2;
    }

}
