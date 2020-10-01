/*
Author:Otosun
Tarih :13/07/2020
*/
package Gun36.tasks.Task1;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }
    public Book(String name, int publishYear) {
        this(name,publishYear,"");
    }
    public Book(String name) {
        this(name,0,"");
    }

    void yazdir(){
        System.out.println(name+" "+publishYear+" "+author);
    }

    public String toString (){
        return (name+" "+publishYear+" "+author);
    }


}
