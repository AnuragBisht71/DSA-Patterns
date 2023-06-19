// Convert number n of base1 to base2

// Input:-

// 111001 --> number
// 2 --> base1
// 3 --> base2

// Output :-

// 2010



package functions;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int cval = anyBaseToAnyBase(n, sourceBase, destBase);
        System.out.println(cval);

        scn.close();
    }

    public static int anyBaseToAnyBase(int num, int b1, int b2) {
        int cval = decimalToAnyBase(num,b1);
        int dval = anyBaseToDecimal(cval,b2);
        
        System.out.println("Output :-");
        return dval;
    }

    public static int decimalToAnyBase(int n, int b) {
        int res = 0;
        int pos = 0;
        while(n != 0) {
            int rem = n % 10;
            n = n / 10;

            int pow = (int)Math.pow(b,pos);
            res = res + (rem * pow);
            pos++;
        }
        
        return res;
    }
    
    public static int anyBaseToDecimal(int n, int b) {
        int res = 0;
        int pos = 0;
        while(n != 0) {
            int rem = n % b;
            n = n / b;

            int pow = (int)Math.pow(10,pos);
            res = res + (rem * pow);
            pos++;
        }
        
        return res;
    }
}
