import java.util.Scanner;
import java.util.Arrays;
public class ElemanSirala {
    static void arry(int liste[])
    {
        int min=0, z;
        Scanner input = new Scanner(System.in);
        for(int i =0; i<liste.length;i++)
        {
            System.out.println(i+1 + ". değeri giriniz");
            z = input.nextInt();
            liste[i]=z;
        }
        for(int i =0; i<liste.length;i++)
        {
            System.out.println(liste[i]);

        }
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi boyutunu giriniz");
        int x = input.nextInt();
        int[] aryy = new int[x];
        arry(aryy);


    }
}
