public class TekrarliDizi {
    static void arry(int liste[])
    {
        for(int i =0; i<liste.length;i++)
        {
            liste[i] = 10;
        }
        for(int i =0; i< liste.length -1 ;i++)
        {
            if(liste[i] == liste[i+1])
            {
                System.out.print(liste[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        int[] liste = new int[5];
        arry(liste);


    }
}
