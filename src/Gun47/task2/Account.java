/**
 * @Author:Otosun Tarih :28/07/2020
 */
package Gun47.task2;

public class Account {
     int number;
     double balance;
    public Account(){

    }
    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double gelenPara){

       this.balance+=gelenPara;
    }

   public void withdraw(double gidenPara){
        if (gidenPara>this.balance)
        throw new RuntimeException("Yetersiz Bakiye...");
        this.balance-=gidenPara;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
