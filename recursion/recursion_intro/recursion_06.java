// Power-logarithmic

// Input :-

// 2
// 5

// Output :-

// 32



package recursion.recursion_intro;

import java.util.Scanner;

public class recursion_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println("Output :-");
        System.out.println(power(x,n));

        scn.close();
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }

        int xPowNm1 = power(x, n / 2);
        int xPowN = xPowNm1 * xPowNm1;
        if(n%2 == 1) {
            xPowN *= x;
        }

        return xPowN;
    }
}
