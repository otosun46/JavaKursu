/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Soru1;

public abstract class Food {
    private String name;
   public abstract void madeIn();
   public abstract void taste();
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
