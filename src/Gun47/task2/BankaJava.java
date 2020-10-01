/**
 * @Author:Otosun Tarih :28/07/2020
 */
package Gun47.task2;
// 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
// 2- bir consructor ekleyiniz.
// 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
// 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
// 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
// 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
public class BankaJava {
    public static void main(String[] args) {
        try {
            Account account1 = new Account();
            account1.deposit(1000);
            System.out.println("account1.balance = " + account1.getBalance());
            account1.withdraw(500);
            System.out.println("account1.balance = " + account1.getBalance());
            // account1.balance=100000;
            System.out.println("account1.balance = " + account1.getBalance());

            account1.withdraw(6000);

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    }

