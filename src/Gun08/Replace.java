package Gun08;

public class Replace {
    public static void main(String[] args) {
        String text= "Merhaba Dunya";

        System.out.println("Orijinal hali: "+ text);
        System.out.println("a larin e yapilmis hali: "+ text.replace('a','e'));
        System.out.println("Dunya->Java hali: "+ text.replace("Dunya","Java"));

    }
}
