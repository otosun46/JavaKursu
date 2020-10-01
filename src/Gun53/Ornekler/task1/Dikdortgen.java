/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.task1;

public class Dikdortgen implements IGeometri{
    private int genislik;
    private int uzunluk;

    public Dikdortgen(int genislik, int uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }


    @Override
    public double cevresi() {
        return (genislik+uzunluk)*2;
    }

    @Override
    public double alani() {
        return genislik*uzunluk;
    }
}
