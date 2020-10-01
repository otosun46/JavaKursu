/**
 * @Author:Otosun Tarih :18/08/2020
 */
package Gun59.Ornek1;

public abstract class Bank {
    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public Bank(String name, String phoneNumber, String address, int numEmployee) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setNumEmployee(numEmployee);
    }

    String withdraw(double gidenPara){
    this.balance=gidenPara;
    return gidenPara+" Euro cekildi...";
    }
    String deposit(double gelenPara){
    this.balance+=gelenPara;
    return gelenPara+" Euro alindi";
    }
    String loan(){
        return "Kredi cekilebilir";

    }
    abstract void openAccount();
    abstract void closeAccount();

}
