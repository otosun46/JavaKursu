/**
 * @Author:Otosun Tarih :04/08/2020
 */
package Gun49.GununSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    String name;
    int maxStudent;
    List<Student> students;
    List<Employee> employees;

    public School(String name, int maxStudent) {
        setName(name);
        setMaxStudent(maxStudent);
        this.students=new ArrayList<>();
        this.employees=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public void registerStudent(){
        String onay="n";
        do {
            Student student=new Student(isimDuzenle(kullanicidanVeriAl("Student name")),
            stringDuzenle(kullanicidanVeriAl("Student address")),this,UyeTipi.OGRENCI);
            student.setFee(Double.parseDouble(kullanicidanVeriAl("Student fee")));
            this.students.add(student);
            onay=kullanicidanVeriAl("Will you register new student(Y/N)");
        }while (onay.equalsIgnoreCase("y"));
    }
    public void registerEmployee(){
        String onay="n";
        do {
        Employee employee=new Employee(isimDuzenle(kullanicidanVeriAl("Employee name")),
        stringDuzenle(kullanicidanVeriAl("Employee address")),this,UyeTipi.CALISAN);
        employee.setSalary(Double.parseDouble(kullanicidanVeriAl("Employee salary")));
        this.employees.add(employee);

        onay=kullanicidanVeriAl("Will you register new employee(Y/N)");
        }while (onay.equalsIgnoreCase("y"));
    }

    public String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");

        return oku.nextLine();
    }

    public String isimDuzenle(String str) {
        str = str.trim();
        str = str.replaceAll("[ ]+", " ");
        String[] arr = str.split(" ");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = arr[arr.length - 1].toUpperCase();
                str += arr[i];
            } else {
                arr[i] = kelimeDuzenle(arr[i]);
                str += arr[i] + " ";
            }
        }
        return str;
    }

    public String stringDuzenle(String str) {
        str = str.trim();
        str = str.replaceAll("[ ]+", " ");
        String[] arr = str.split(" ");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kelimeDuzenle(arr[i]);
            if (i < arr.length - 1) {
                str += arr[i] + " ";
            } else
                str += arr[i];
        }
        return str;
    }

    public String kelimeDuzenle(String str) {
        str = str.trim();
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    @Override
    public String toString() {
        return "School*****************************************\n" +
                "Name      : " + name + "\n" +
                "MaxStudent: " + maxStudent +"\n"+
                "Students  : ====================================\n" + students +
                "Employees : ===================================\n" + employees+"\n";
    }
}
