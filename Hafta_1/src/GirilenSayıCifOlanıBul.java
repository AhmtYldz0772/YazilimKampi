import java.util.Scanner;
public class GirilenSayıCifOlanıBul {
    public static void main(String[] args) {
        int k, toplam =0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        k = input.nextInt();

        for(int i=0; k >= 0; k--)
        {
            if((k % 3 == 0) && (k % 4 == 0))
            {
                toplam += k;
                System.out.println(toplam);
            }
        }
        System.out.println("toplam değer" + toplam);
    }
}
