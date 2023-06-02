public class Arry {
    static  double avarage(double list[])
    {
        int toplam =0;
        for(int k =0; k<list.length;k++)
        {
            toplam += list[k];
        }
        double ortalama = toplam/list.length;
        return ortalama;
    }
    static void input(double liste[])
    {
        for(int i =0; i< liste.length;i++)
        {
            liste[i] = (i * 10) +10;
            System.out.println(liste[i]);
        }
    }
    public static void main(String[] args) {
        double[] arry = new double[5];
        input(arry);
       System.out.println("ortalaması: "+ avarage(arry));

    }
}
