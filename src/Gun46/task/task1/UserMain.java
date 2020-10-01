/**
 * @Author:Otosun Tarih :27/07/2020
 */
package Gun46.task.task1;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        int miktar=0;
        boolean  usernameIste=true;

        do{
            String username="";
            String password="";
            if (usernameIste){
                username=kullanicidanVeriAl("Kullanici adini giriniz");
            }
        password=kullanicidanVeriAl("Sifrenizi giriniz");
            try {
                User yeniUser = new User(username, password);
                miktar++;
                usernameIste=true;
            }
            catch (Exception ex)
            {
                usernameIste=false;
                System.out.println(ex.getMessage());
            }
        }while(miktar <2);
    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}
/*
int miktar=0;
        Scanner oku=new Scanner(System.in);

        do{
            System.out.print( (miktar+1) + ".User Name=");
            String username=oku.nextLine();

            System.out.print("Password=");
            String password=oku.nextLine();

            try {
                User yeniUser = new User(username, password);
                miktar++;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }while(miktar <2);
    }
}
 */