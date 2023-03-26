// Any base subtraction

// Input :-

// 8 --> base
// 1 --> n1 
// 100 --> n2

// Output :-

// 77

package functions;

import java.util.Scanner;

public class function_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        int res = 0;
        int pos = 1;
        int borrow = 0;

        while(n1 != 0 || n2 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int diff = d2 - d1 - borrow;
            if(diff < 0) {
                diff = diff + b;
                borrow = 1;
            }
            else {
                borrow = 0;
            }

            res = res + (diff * pos);
            n1 = n1 / 10;
            n2 = n2 / 10;
            pos = pos * 10;
        }

        System.out.println("Output :-");
        return res;
    }
}
