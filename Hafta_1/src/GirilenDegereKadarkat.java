import java.util.Scanner;
public class GirilenDegereKadarkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("değer giriniz:");
        int k;
        k = input.nextInt();

        for (int i = 0; i <= k; i++)
        {
            if(i % 4 == 0 && i % 5 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
