import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int n,i,counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        n = input.nextInt();

        for(i=1; i<n; i++){
            if(n%i == 0){
                counter+=i;
            }
        }
        if(counter == n){
            System.out.print("Tbu sayı " + n + " mükkemel  sayısıdır.");
        }
        else{
            System.out.print("Tbu sayı " + n +" mükkemel sayısı değlidr. ");
        }
    }
}
