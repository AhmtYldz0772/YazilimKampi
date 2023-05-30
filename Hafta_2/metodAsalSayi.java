import java.util.Scanner;
public class metodAsalSayi {
    static boolean asal(int x)
    {
        for (int i = 2; i <= x; i++)
        {
            boolean asalMi = true;

            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi)
            {
                System.out.println(i);
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" değer giriniz:  ");
        int r = input.nextInt();
        System.out.println( asal(r));

    }
}
