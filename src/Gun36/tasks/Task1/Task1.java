/*
Author:Otosun
Tarih :13/07/2020
*/
package Gun36.tasks.Task1;
//Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
//3 adet Consructor ekleyiniz.
//Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
// 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
public class Task1 {
    public static void main(String[] args) {
        Book book=new Book("Hayal Dunyasi",2020,"Yilin Yazari");
        Book book1=new Book("Sessiz Gemi",2010);
        Book book2=new Book("Yasananlar");


        book.yazdir();
        book1.yazdir();
        book2.yazdir();
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
    }
}
