// Input :-

// 57 --> Number
// 2 --> Base

// Output :-

// 111001



package functions;

import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input");

        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        int res = 0;
        int pos = 0;
        while(n != 0) {
            int rem = n % b;
            n = n / b;

            int pow = (int)Math.pow(10,pos);
            res = res + (rem*pow);
            pos++;
        }
        
        System.out.println("Output :-");
        return res;
    }
}
