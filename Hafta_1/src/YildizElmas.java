import java.util.Scanner;
public class YildizElmas {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("alt değer giriniz:");
        n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = input.nextInt();

        int boslukSayisi = satirSayisi - 1;
        int yildizSayisi = 1;

        // Elmasın üst kısmını oluşturma
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();

            boslukSayisi--;
            yildizSayisi += 2;
        }

        boslukSayisi = 1;
        yildizSayisi = satirSayisi * 2 - 3;

        // Elmasın alt kısmını oluşturma
        for (int i = 0; i < satirSayisi - 1; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
