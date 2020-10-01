/**
 * @Author:Otosun Tarih :04/08/2020
 */
package Gun49.GununSorusu;

import java.util.ArrayList;

/*
Part 1: Create inheritance as in following picture


Part 2: In toString methods of Student show in example below
Student
name: John
address: Main 1011
fee: $1000


In toString methods of Employee show in example below
Employee
name: Max
address: Lower st 15
salary: $60_000

Part 3: Add properties to School class as in picture

Part 4: Create class SchoolManagement, register some students and employees to your school
(Hint: constructors)

 */
public class Main {
    public static void main(String[] args) {
        School okul=new School("Halmstad School",5);
        okul.registerStudent();
        /*
        for (Student ogr:okul.students) {
            //System.out.println(ogr.getName()+"\n"+ogr.getSchool().name+"\n"+ogr.getAddress());
            System.out.println(ogr);
        }
        */
        okul.registerEmployee();
        /*
        for (Employee emp:okul.employees) {
            System.out.println(emp);
        }

         */
        System.out.println(okul.toString());

    }



}
