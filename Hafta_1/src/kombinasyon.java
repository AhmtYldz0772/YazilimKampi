import java.util.Scanner;
public class kombinasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f, b;
        System.out.print("deger giriniz");
        f = input.nextInt();
        System.out.print("deger giriniz");
        b = input.nextInt();

        double C = faktoril(f);
        System.out.println("faktriel degeri:  "+ f);
        double r = faktoril(b);
        System.out.println("faktoriel degeri:  "+ b);
        double t = faktoril((f-b));
        System.out.println("faktoriel (k-b) degeri:  "+ t);
        double Combinasyon = C/(r*(t));
        System.out.println("Combinasyon degeri:  "+ t);
    }
    static int faktoril(int c) {
        int toplam=1;

        for (int i = 1; i <= c; i++)
        {
            toplam = toplam * i;
        }
        return toplam;
    }
}
