/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.staticModifier;

public class Student {
    int id;
    String name;
    String surname;
    static int ogrenciSayisi=0;
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ogrenciSayisi++;
        this.id = ogrenciSayisi;
    }



    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                '}';
    }
}
