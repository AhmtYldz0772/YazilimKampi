public class Matris {
    static void matris(int arry[][])
    {
        int number =1;
        for(int i =0; i<arry.length;i++)
        {
            for(int j = 0; j<arry[i].length; j++)
            {
                if(i==j)
                {
                    arry[i][j] = 0;
                    number++;
                }
                else
                {
                    arry[i][j] = number++;
                }
            }
        }

        for(int i =0; i<arry.length;i++)
        {
            for(int j = 0; j<arry[i].length; j++)
            {
                System.out.print(" "+arry[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] list = new int[3][4];
        matris(list);

    }
}
