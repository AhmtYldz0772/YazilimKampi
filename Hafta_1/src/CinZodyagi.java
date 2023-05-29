import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz: ");
        int dogumYilli = input.nextInt();
        dogumYilli = dogumYilli % 12;
        System.out.println("doğum yılınızda aya göre değeri   " + " " + dogumYilli);

        switch(dogumYilli)
        {
            case 1:
                System.out.print("Maymun");
                break;
            case 2:
                System.out.print("Horoz");
                break;
            case 3:
                System.out.print("köpek");
                break;
            case 4:
                System.out.print("domuz");
                break;
            case 5:
                System.out.print("fare");
                break;
            case 6:
                System.out.print("öküz");
                break;
            case 7:
                System.out.print("kaplan");
                break;
            case 8:
                System.out.print("tavşan");
                break;
            case 9:
                System.out.print("ejderha");
                break;
            case 10:
                System.out.print("yılan");
                break;
            case 11:
                System.out.print("at");
                break;
            case 12:
                System.out.print("koyun");
                break;
            default:
                System.out.print("hattalı işlem oldu");
                break;
        }
    }
}
