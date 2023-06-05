public class Transpoze {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 4}};

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpoz:");
        matrisiYazdir(transpozMatris);
    }

    public static void matrisiYazdir(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
