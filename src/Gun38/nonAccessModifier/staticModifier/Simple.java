/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.staticModifier;

public class Simple {
    int a;
    static int b;

    void increase(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple ornek=new Simple();
        ornek.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        Simple.b=5;
        Simple.b=7;
        ornek.increase();
        ornek2.increase();
        System.out.println("ornek.a = " + ornek.a);//ornek.a = 6
        System.out.println("ornek2.a = " + ornek2.a);//ornek2.a = 8
        System.out.println("Simple.b = " + Simple.b);//Simple.b = 9

    }
}
