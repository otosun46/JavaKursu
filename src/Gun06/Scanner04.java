package Gun06;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);

        int biletSayisi;
        boolean sigorta;
        System.out.print("Kac bilet istiyorsunuz? :");
        biletSayisi= oku.nextInt();

        System.out.print("Sigorta istiyormusunuz? :");
        sigorta= oku.nextBoolean();

        System.out.println(biletSayisi+ " bilet istiyorsunuz."+ "Sigorta : "+ sigorta);
    }
}
