import java.util.Scanner;
public class AlanCevre {
    public static void main(String[] args) {
        //değişkenler
        int r;
        double pi =3.14;

        // Kullanıcıdan alınacak bilgiler
        Scanner deger = new Scanner(System.in);
        System.out.println("Dairenin yarıcapını giriniz");
        r = deger.nextInt();

        double alan = pi * ( r * r );
        double cevre = 2 * pi * r;
        System.out.println("Dairenin alanı:  " + alan);
        System.out.print("Dairenin cevresi:  " + cevre);

    }
}
