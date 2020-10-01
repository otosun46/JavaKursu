/**
 * @Author:Otosun Tarih :04/08/2020
 */
package Gun49.GununSorusu;

public class Employee extends Person{
    private double salary;

    public Employee(String name, String address,School school,UyeTipi uyeTipi) {
        super(name, address,school,uyeTipi);
        setSalary(salary);
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee *****************\n" +
                "Name       : "+getName()+"\n"+
                "Address    : "+getAddress()+"\n"+
                "Fee        : " + salary +"\n";
    }
}
