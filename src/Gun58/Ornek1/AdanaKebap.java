/**
 * @Author:Otosun Tarih :17/08/2020
 */
package Gun58.Ornek1;

public class AdanaKebap implements Food{
    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 5.0;
    }

    void marinade(){
        System.out.println("Zeytinyagi,kekik ve sut ile marine edildi");
    }
    void grill(){
        System.out.println("Odun komuru korunda pisirildi");
    }
}
