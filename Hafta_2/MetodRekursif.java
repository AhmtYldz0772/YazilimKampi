import java.util.Scanner;
public class MetodRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir değer giriniz: ");
        int r = input.nextInt();
            recursiveMethod(r);
        }

        public static void recursiveMethod(int n) {
            System.out.print(n + " ");

            if (n <= 0) {
                return;
            }

            recursiveMethod(n - 5);
            System.out.print(n + " ");
        }
    }



