import java.util.Scanner;

public class SinşfGecme {
    public static void main(String[] args) {
        // kulıcadan değer alma
        Scanner deger = new Scanner(System.in);

        // alınan değerler

        System.out.print("matemetaik notu girin:");
        double mat = deger.nextDouble();

        System.out.print("fizik notu girin:");
        double fizik = deger.nextDouble();

        System.out.print("kimya notu girin:");
        double kimya = deger.nextDouble();

        System.out.print("türkçe notu girin:");
        double turkce = deger.nextDouble();

        System.out.print("tarih notu girin:");
        double tarih = deger.nextDouble();

        // değerlere göre işlemler
        if(mat >= 0 && fizik >= 0 && kimya >= 0 && turkce >= 0 && tarih >= 0 && mat <=100 && fizik <= 100 && kimya <= 100 && turkce <= 0 && tarih <=100)
        {
            double ortalama = (mat + fizik + kimya + turkce + tarih) / 5;

            if (ortalama >= 50.0) {
                System.out.print("sınıfı geçtiniz" + ortalama);
            } else {
                System.out.print("sınıfta kaldınız" + ortalama);
            }
        }
        else
        {
            System.out.print("geçersiz bir değer girdin:");
        }
    }
}
