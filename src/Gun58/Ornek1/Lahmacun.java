/**
 * @Author:Otosun Tarih :17/08/2020
 */
package Gun58.Ornek1;

public class Lahmacun implements Food{
    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 2.0;
    }

    void dough(){
        System.out.println("Mayali hamur hazirlandi");
    }
    void addMeat(){
        System.out.println("Uygun sekilde acildi");
    }
    void bake(){

    }
}
