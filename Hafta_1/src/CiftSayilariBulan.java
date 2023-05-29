import java.util.Scanner;
public class CiftSayilariBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int k, toplam=0;
        while(true)
        {
            System.out.print("bir değer girin:");
            k = input.nextInt();
            if(k % 2 != 0)
            {
                System.out.print("tek bir değer girildi sistem durduruldu");
                break;
            }
            else if(k %2 == 0 && k%4==0)
            {
                toplam += k;
                System.out.println("girilen çift sayılarve ve 4 ün katı olan sayıların tolamaı:  " + toplam);
            }
        }
    }
}
