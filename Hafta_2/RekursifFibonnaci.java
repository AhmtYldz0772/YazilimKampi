import javax.sound.midi.Soundbank;

public class RekursifFibonnaci {
    static int fibonnaci(int deger) {
        if (deger <= 1) {
            return deger;
        }

        return fibonnaci(deger - 1) + fibonnaci(deger - 2);
    }

    public static void main(String[] args) {
        int k = fibonnaci(7);
        System.out.print(k);
    }
}
