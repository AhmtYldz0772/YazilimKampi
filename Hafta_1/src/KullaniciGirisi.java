import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği
        şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
         lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        // değişkenler
        int newSifre = 123;

        //kulanıcıdan alınan biligler
        Scanner deger = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz");
        int sifre = deger.nextInt();


        //kontrol noktası

            if (sifre == newSifre)
            {
                System.out.print("Giriş başarılı, Hoşgeldiniz");

            }
            else
            {
                System.out.print("Giriş başarısız, Şİfrenizi sıfırlamak ister misiniz");
                String yanit = deger.next();
                if (yanit =="evet")
                {

                    System.out.print("yeni şifre");
                    int newSifree = deger.nextInt();

                    if (newSifree == newSifre)
                        {
                         System.out.print("bu şifreyi daha önce kullandınız");
                        }
                    else
                       {

                         newSifre = newSifree ;
                         System.out.print(newSifre);
                       }

                }
            }


    }
}
