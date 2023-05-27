import java.util.Scanner;
public class KdvTutar {
    public static void main(String[] args) {
        // kulanıcıdan değer al
        Scanner deger = new Scanner(System.in);

        //değişkenler
        double miktar, kdvOran = 0.18;

        //kullanıcıdan alınan tutar
        System.out.println("para miktarını giriniz:");
        miktar = deger.nextDouble();

        double kdvMiktar = (miktar <= 1000) ? miktar*0.18: miktar*0.08 ;
        double kdvliMiktar = miktar + kdvMiktar ;
        System.out.println(kdvliMiktar);


    }
}
