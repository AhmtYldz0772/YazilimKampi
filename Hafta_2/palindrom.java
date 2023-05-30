import java.util.Scanner;
public class palindrom {
    static  boolean isPalidrom(int number)
    {
        int temp = number, reversNumber=0, lastNumber;
        while(temp != 0)
        {
            System.out.println("Sayi:" + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak:" + lastNumber);
            reversNumber = (reversNumber * 10) + lastNumber;
            System.out.println("yeni sayı:" + reversNumber);
            temp /= 10;
        }
        if(number == reversNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı gir");
        int x = input.nextInt();
        System.out.println(isPalidrom(x));

    }
}
