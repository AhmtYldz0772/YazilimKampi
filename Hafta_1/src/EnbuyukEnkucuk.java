import java.util.Scanner;
public class EnbuyukEnkucuk {
    public static void main(String[] args) {
        int n1, n2, n3 = 0, n4 =-1;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç sayı girmek istiyorsunuz: ");
        n1 = input.nextInt();

        for(int i = 1; i <= n1; i++)
        {
            System.out.print("sayı gir: ");
            n2 = input.nextInt();
            System.out.println("sayılar:  "+ i + ". " + n2);

            if (n3 < n2){
                n3 = n2;
            }
            else{

                if(n2 < n4)
                {
                    n4 =n2;
                }
            }
        }
        System.out.println("en büyük sayı:  "+ n3);
        System.out.println("en bküçük sayı:  "+ n4);


    }
}
