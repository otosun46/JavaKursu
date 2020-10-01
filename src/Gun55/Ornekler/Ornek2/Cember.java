/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek2;

public class Cember extends Sekil{
    private int yaricap;

    public Cember(int yaricap) {
        this.yaricap=yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double Alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double Cevre() {
        return 2*Math.PI*yaricap;
    }


}
