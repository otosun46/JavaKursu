/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek2;

public abstract class Sekil {
    String name;

    public Sekil() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sekil(String name) {
        this.name = name;
    }

    abstract double Alan();

    abstract double Cevre();

    @Override
    public String toString() {

        return "Sekil{" +
                "Alan=" + Alan()+'\''+
                "Cevre="+Cevre()+'\''+
                '}';
    }

    public void ciz(){
        System.out.println(this.name+" cizildi");
    }
}
