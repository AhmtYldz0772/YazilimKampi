import java.util.Scanner;
public class vucutKitIndeks {
    public static void main(String[] args) {
        // değişkenler
        double indeks, boy, kilo;

        //kullanıcadan lınacak bilgiler
        Scanner deger = new Scanner(System.in);
        System.out.println("Boyunuzu Metre cinsinden giriniz");
        boy = deger.nextDouble();

        System.out.println("kilonuzu giriniz");
        kilo = deger.nextDouble();

        // alınan değerlere göre indeks hesabı

        indeks = kilo / (boy * boy);
        System.out.println("vucut kitle indeksi:  " + indeks);
        

    }
}
