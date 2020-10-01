package Gun05;
import java.util.Scanner;
import java.util.Random;
public class ScannerEXP {

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Addition Tool!\n");
        Random rand = new Random();
        int randint1 = rand.nextInt(100);
        System.out.println("First Random Number: " + randint1);
        int randint2 = rand.nextInt(100);
        System.out.println("Second Random Number: " + randint2);
        Scanner input1 = new Scanner(System.in);
      //  String input1_1 = input1.next();
        int input1_2 = input1.nextInt();
        if (input1_2== randint1 + randint2) {
            System.out.print("Correct! The solution was: " + randint1 + " + " + randint2 + " = " + (randint1 + randint2));
        } else {
            System.out.println("Wrong Answer! Try Again.");
        }
    }
}
