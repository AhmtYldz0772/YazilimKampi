import java.util.Scanner;
public class OrtalamaHesapla {
    public static void main(String[] args) {
        // değişkenler
          int mat, fizik, kimya, turkce, muzik;

        Scanner deger = new Scanner(System.in);
        //kullanıcıdan değer al
          System.out.println("matematik notunuzu giriniz:");
          mat = deger.nextInt();
          System.out.println("matematik notunuz:" + mat);

          System.out.println("fizik notunuzu giriniz:");
          fizik = deger.nextInt();
          System.out.println("Fizik notunuz:" + fizik);

          System.out.println("Kimya notunuzu giriniz:");
          kimya = deger.nextInt();
          System.out.println("Kimya notunuz:" + kimya);

          System.out.println("turkce notunuzu giriniz:");
          turkce = deger.nextInt();
          System.out.println("turkce notunuz:" + turkce);

          System.out.println("muzik notunuzu giriniz:");
          muzik = deger.nextInt();
          System.out.println("muzik notunuz:" + muzik);
          int dersOrtalaması = (mat + fizik + kimya + turkce + muzik) / 5;
          // b = (a == 1) ? 20: 30;
          boolean durum = (dersOrtalaması>=50) ? true : false;

          System.out.print("Tüm ders ortalamaları:  " + dersOrtalaması + "  bu ortalamaya göre true ise geçtiniz felase ise kaldınız  "+  " " +durum);
    }
}
