import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int k; double result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("alt değer giriniz:");
        k = input.nextInt();

        for(int i = 1; i <= k; i++)
        {
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
