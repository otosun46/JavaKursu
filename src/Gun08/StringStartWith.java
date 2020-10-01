package Gun08;

public class StringStartWith {
    public static void main(String[] args) {
        String text = "Merhaba Dunya";

        System.out.println("ME ile basliyor mu? "+ text.startsWith("ME"));
        System.out.println("Me ile basliyor mu? "+ text.startsWith("Me"));
        System.out.println("M ile basliyor mu? "+ text.startsWith("M"));
        System.out.println("K ile basliyor mu? "+ text.startsWith("K"));
    }
}
