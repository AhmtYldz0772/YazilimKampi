import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, l,t=1;
        System.out.print("alt değer giriniz:");
        k = input.nextInt();

        System.out.print("üst değer giriniz:");
        l = input.nextInt();

        for (int i = 1; i <= l; i++)
        {
            t = t * k;
        }
        System.out.print(t);
    }
}
