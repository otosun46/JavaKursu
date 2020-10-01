/*
Author:Otosun
Tarih :07/07/2020
*/
package Gun32.task.task2;

public class ElectricityAccount {

    int totalKw=0;
    double rate=0.7;
    double bill;

    void tuketimEkle(int tuketim){
        totalKw+=tuketim;
    }

    double tolalBill(){
        return totalKw*rate;
    }
}
