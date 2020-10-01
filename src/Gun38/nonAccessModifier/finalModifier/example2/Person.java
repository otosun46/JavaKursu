/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.finalModifier.example2;

public class Person {
    String name;
    final int fingerprintcode;

    public Person(String name, int fingerprintcode) {
        this.name = name;
        this.fingerprintcode = fingerprintcode;

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerprintcode=" + fingerprintcode +
                '}';
    }
// final değişkenlerine ilk değer atama işlemi direk
    // yapılabildiği gibi constructorla da atanabilir.
    // ancak daha sonra yine değeri değiştirilemez.
    // bu işlem ilk değer atama için geçerli.
}
