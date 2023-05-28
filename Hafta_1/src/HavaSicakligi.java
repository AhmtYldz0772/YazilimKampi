import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz");
        int value = input.nextInt();
        switch (value) {
            case 5:
                System.out.print("kayak yap");
                break;
            case 10:
                System.out.print("çay keyfi");
                break;
            case 15:
                System.out.print("deniz keyfi");
                break;
            default:
                System.out.print("geçersiz değer ");
                break;
        }
    }
}
