/*
Author:Otosun
Tarih :30/06/2020
*/
package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");
        hs.add("Red");
        hs.add("rED");

        //1.yol
        System.out.println(hs);
        //2. yol
        for(String yaz:hs){
            System.out.println(yaz);
        }
/*
        //3. yol
        Iterator gosterge=hs.iterator();

        while (gosterge.hasNext()){
            System.out.println(gosterge.hasNext());
        }
*/

        //3.Yol
        Iterator gosterge=hs.iterator();
        while (gosterge.hasNext()) // sonraki varsa
        {
            System.out.println("Sonraki eleman = " + gosterge.next());
        }
        hs.remove("red");
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);


    }
}
