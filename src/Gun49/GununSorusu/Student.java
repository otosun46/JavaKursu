/**
 * @Author:Otosun Tarih :04/08/2020
 */
package Gun49.GununSorusu;

public class Student extends Person {
    private double fee;

    public Student(String name, String address,School school,UyeTipi uyeTipi) {
        super(name, address,school,uyeTipi);
        setFee(fee);

    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student *****************\n" +
                "Name       : "+getName()+"\n"+
                "Address    : "+getAddress()+"\n"+

                "Fee        : " + fee+"\n";
    }
}
