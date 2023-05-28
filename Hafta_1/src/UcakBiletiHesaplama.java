import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
         yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde
        kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        int yas,yon, km;
        double mesafeUcret = 0.10;


        Scanner input = new Scanner(System.in);

        System.out.print("yaşınızı giriniz");
        yas = input.nextInt();
        if(yas <=0){System.out.println("geçersiz değer girdiniz");}

        System.out.print("km giriniz");
        km = input.nextInt();
        if(km <=0){System.out.println("geçersiz değer girdiniz");}

        System.out.print("tek yön ise 1 mü gidiş gelişmi  ise 2 giriniz ");
        yon = input.nextInt();
        if((yon < 0) && (yon >2)){System.out.println("geçersiz değer girdiniz");}

        if(yas<=12)
        {
            if(yon == 2)
            {
                double toplamUcret = (mesafeUcret - (mesafeUcret * km)/2) - (mesafeUcret * km)*(20/100);
                System.out.print("toplam ucuş üçreti: " + toplamUcret );
            }
            else {
                double toplamUcret = mesafeUcret - (mesafeUcret * km) / 2;
                System.out.print("toplam ucuş üçreti: " + toplamUcret);
            }
        }
        else if((12 <= yas) && (yas <=24))
        {
            if(yon == 2)
            {
                double toplamUcret = (mesafeUcret - (mesafeUcret * km)*(10/100)) - (mesafeUcret * km)*(20/100);
                System.out.print("toplam ucuş üçreti: " + toplamUcret );
            }
            else {
                double toplamUcret = mesafeUcret - (mesafeUcret * km) * (10/100);
                System.out.print("toplam ucuş üçreti: " + toplamUcret);
            }
        }
        else if(yas >= 60)
        {
            if(yon == 2)
            {
                double toplamUcret = (mesafeUcret - (mesafeUcret * km) * (30/100)) - (mesafeUcret * km)*(20/100);
                System.out.print("toplam ucuş üçreti: " + toplamUcret );
            }
            else {
                double toplamUcret = mesafeUcret - (mesafeUcret * km) * (30/100);
                System.out.print("toplam ucuş üçreti: " + toplamUcret);
            }
        }


    }
}
