package Gun03;

public class ScopeInceleme {

    public static void main(String[] args) {

        int a=5;
        {   // gecerlilik siniri bu parantezler arasindadir
            int b=7;

            a=8;
         
        }
        a= 56;

      //  b=6; // bu sekilde kullanilmaz


    }
}
