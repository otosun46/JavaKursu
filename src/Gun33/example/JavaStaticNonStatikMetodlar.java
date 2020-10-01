/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.example;
/*
Butun programlarda kullanacagim tip donusumlerine ihtiyacim var.
Bunlari yazan bir sinif yaziniz ve bunlari main de kullanarak gosteriniz.
 */
public class JavaStaticNonStatikMetodlar {
    public static void main(String[] args) {
        int sayi=345;
        String strRakam= String.valueOf(sayi);
        int intRakam= Integer.parseInt(strRakam);

        // yeniden oluşturmadığımız sınıfın direk adı ile kullanıyoruz.
        strRakam=myUtility.getString(sayi);
        intRakam=myUtility.getInt(strRakam);
        Math.random();

    }

}
