import java.util.Scanner;

public class KmHasepla {
    public static void main(String[] args) {
        //değişkenler
        int km;
        double perkm = 2.20, total, baslangic = 10;

        // kullanıcıdan alınacak bilgiler

        Scanner deger = new Scanner(System.in);
        System.out.print("mesafeyi km cinsinden girniz: ");
        km = deger.nextInt();

        // alınan biligiye göre hesaplama
        total = perkm*km;
        total += baslangic;

        total = (km<20)? 20: total;
        System.out.println("toplam ucret:  " + total);


    }
}
