package Gun07;

public class StringIsEmpty {
    public static void main(String[] args) {
        String str1= "Hi";
        String str2= "     ";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        System.out.println("str2.isEmpty() = " + str2.isBlank());
    }
}
