import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        int k, countr=0, t, toplam =0,  asmtrop =0;

        Scanner input = new Scanner(System.in);
        System.out.print("alt değer giriniz:");
        k = input.nextInt();
        t = k;
        while(t !=0)
        {
            t /= 10;
            countr++;
        }
        System.out.println("sayımızın basamak sayısı:    " + countr);
         t = k;
        while(t !=0)
        {
            int l = t %10;
            toplam += l;
            int ust=1;
            for (int i = 1 ; i <= countr; i++)
            {
                 ust = ust * l ;
                 System.out.println(" ust sayısı:  "+ust);
            }
            asmtrop += ust;
            t /= 10;
        }
        System.out.println("basamaklar toplamı: " + toplam);
        if(asmtrop == k)
        {
            System.out.println("armstraop bir sayı");
        }else
        {
            System.out.println("armstraop bir sayı değildir");
        }
    }
}
