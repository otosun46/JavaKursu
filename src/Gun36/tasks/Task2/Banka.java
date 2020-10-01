/*
Author:Otosun
Tarih :13/07/2020
*/
package Gun36.tasks.Task2;

public class Banka {
    int musteriNo;
    String name;
    String surName;
    int bakiye;

    public Banka(int musteriNo, String name, String surName, int bakiye) {
        this.musteriNo = musteriNo;
        this.name = name;
        this.surName = surName;
        this.bakiye = bakiye;
    }

    public Banka(int musteriNo, String name, String surName) {
        this(musteriNo,name,surName,0);
    }
    public Banka(int musteriNo) {
        this(musteriNo,"","",0);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "musteriNo=" + musteriNo +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
