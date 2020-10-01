/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.task1;

public class Cember implements IGeometri {
    private int yaricap;

    public Cember(int yaricap) {
        this.yaricap = yaricap;
    }


    @Override
    public double cevresi() {
        return 2*PI*yaricap;
    }

    @Override
    public double alani() {
        return PI*yaricap*yaricap;
    }
}
