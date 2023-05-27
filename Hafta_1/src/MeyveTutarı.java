import java.util.Scanner;
public class MeyveTutarı {
    public static void main(String[] args) {
        // değişkenler
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        // kullanıcadan alınacak bilgiler
        Scanner deger = new Scanner(System.in);
        System.out.print("Armut kaç kilo aldınız:");
        double armutK = deger.nextDouble();

        System.out.print("elma kaç kilo aldınız:");
        double elmaK = deger.nextDouble();

        System.out.print("domates kaç kilo aldınız:");
        double domatesK = deger.nextDouble();

        System.out.print("muz kaç kilo aldınız:");
        double muzK = deger.nextDouble();

        System.out.print("patlıcan kaç kilo aldınız:");
        double patlıcanK = deger.nextDouble();

        // alınan bilgilere göre işlem

        double toplamTutar = (armut * armutK) + (elma * elmaK) + ( domates * domatesK) + ( muz * muzK) + ( patlıcan * patlıcanK);
        System.out.println("Toplam tutar: " + toplamTutar);
    }
}
























