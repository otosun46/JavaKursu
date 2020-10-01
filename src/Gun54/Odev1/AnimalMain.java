/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev1;

public class AnimalMain {
    public static void main(String[] args) {

        Duck duck=new Duck();
        Cat cat=new Cat();
        Shark shark=new Shark();
        Swallow swallow=new Swallow();
        System.out.println(duck.food());
        System.out.println(cat.food());
        System.out.println(shark.food());
        System.out.println(swallow.food());
        System.out.println(duck.fyling());
        System.out.println(swallow.fyling());
        System.out.println(shark.sailing());


    }
}
