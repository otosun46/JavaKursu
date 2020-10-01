/*
Author:Otosun
Tarih :01/07/2020
*/
package Gun28;

import java.util.HashSet;
import java.util.Set;

/*
// add : Set icersinde bir eleman ekler
    // clear : Set icerisndeki butun elemanlari siler.
    // contains : Bir eleman dizi icinde mi kontrl eder.
    // remove : bir eleman siler
    // size : o ana kadar kac eleman ekledigini dondurur.
    // isEmpty : bos olup olmadigini kontrol eder.
    // containsAll : bellirli bir eleman , set icerisinde var mi yok mu bakiyor
    // addAll : coklu islemler toplu ekleme baska bir kumeyi kumeye ekleme
    // retainAll : iki kumenin kesisimini bulur
    // removeAll : hepsini siler
    // toArray : seti dizi haline getiriyor, dizi formatina cevirme

 */
public class setVeMap {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add("Ali");
        s.add("Veli");
        s.add("Selami");
        s.add("Ali");
        System.out.println(s);
    }
}
