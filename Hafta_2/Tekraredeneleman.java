public class Tekraredeneleman {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frekanslar = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {
            int eleman = dizi[i];
            frekanslar[i] = -1; // Eleman zaten işlendiği için başlangıçta -1 olarak işaretlenir
            int frekans = 1;

            for (int j = i + 1; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    frekans++;
                    dizi[j] = -1; // Tekrarlı elemanlar işlendiği için -1 olarak işaretlenir
                }
            }

            if (frekanslar[i] != -1)
            {
                frekanslar[i] = frekans;
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != -1)
            {
                System.out.println(dizi[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
            }
        }
    }

}
