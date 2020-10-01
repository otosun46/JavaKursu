package Gun08;

public class StringReplacefirst {

    public static void main(String[] args) {

        String text= "Merhaba Dunya";

        System.out.println(text.replaceFirst("Merhaba","Nasilsin"));
        System.out.println(text.replaceAll("[A-Z]","-"));
        System.out.println(text.replaceAll("[eau]",""));

    }
}
