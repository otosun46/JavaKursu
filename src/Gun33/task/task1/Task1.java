/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.task.task1;
/*
 Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle ayri bir sinif yazarak,
 (kendi metodunuzun içinde Math.fonksiyonlarınız kullanabilirsiniz)
 mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
 kullanımlarını yazınız.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(MyMath.faktoriyel(5));
        System.out.println(MyMath.randomNum(10));
        System.out.println(MyMath.randomNum(10,20));
        System.out.println(MyMath.usAlma(3,3));
        System.out.println(MyMath.toplama(15));

    }
}
