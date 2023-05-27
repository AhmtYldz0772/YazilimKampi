import java.util.Scanner;
public class Hipetenus {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);

        // değişkenler
        int a, b ;
        double c;

        // kulanıcıdan kenar bilgisi alnır
        System.out.print("1.kenarı giriniz:");
        a = deger.nextInt();

        System.out.print("2.kenarı giriniz:");
        b = deger.nextInt();

        // hipetanüs hesaplanır

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("hipetenüs değeri: " + c);
    }
}
