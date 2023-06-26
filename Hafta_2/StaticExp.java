import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StaticExp {
    public class Solution {
        static int B;
        static int H;
        static boolean flag;

        static {
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();

            if (B > 0 && H > 0) {
                flag = true;
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            }

            scanner.close();
        }


        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class
}
