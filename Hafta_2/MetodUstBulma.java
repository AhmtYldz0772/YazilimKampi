import java.util.Scanner;
public class MetodUstBulma {
    static int ust(int alt, int ust)
    {
        int result = 1;
        for(int i=1; i<= ust; i++)
        {
            result *= alt;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("alt değeri giriniz:  ");
       int r = input.nextInt();
        System.out.println("üst değeri griniz:   ");
        int l = input.nextInt();
       System.out.println("üstlü sayınım çıktısı: " + ust(r,l));

    }
}
