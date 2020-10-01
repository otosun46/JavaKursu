package Gun07;

public class StringEquals {
    public static void main(String[] args) {
        String str = "Merhaba";
        boolean birebirEsitmi = str.equals("Merhaba");
        System.out.println(birebirEsitmi);

         birebirEsitmi = str.equalsIgnoreCase("merhaba");
        System.out.println(birebirEsitmi);
    }
}
