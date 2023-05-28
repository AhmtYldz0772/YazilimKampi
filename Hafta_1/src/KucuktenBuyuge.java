import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("sayı1 bir değer giriniz");
        a = input.nextInt();

        System.out.print("sayı2 bir değer giriniz");
        b = input.nextInt();

        System.out.print("sayı3 bir değer giriniz");
        c = input.nextInt();

        if((a>b) && (a>c))
        {
            if(b >c)
            {
                System.out.print("a > b > c");
            }
            else
            {
                System.out.print("a > c > b");
            }
        }
        else if ((a < b) && (b > c))
        {
            if(a > c)
            {
                System.out.print("b > a > c");
            }
            else
            {
                System.out.print("b > c > a");
            }
        }
        else if ((c > b) && (a < c))
        {
            if(a >b)
            {
                System.out.print("c > a > b");
            }
            else
            {
                System.out.print("c > b > a");
            }
        }
    }
}
