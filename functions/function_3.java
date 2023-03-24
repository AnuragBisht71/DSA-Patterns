package functions;
// Convert any base value to Decimal base value

// Input:-
// 111001 --> Binary Number
// 2 --> Base

// Output:-
// 57


import java.util.Scanner;

public class function_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input");

        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);

        scn.close();
    }

    public static int getValueIndecimal(int n, int b){
        int res = 0;
        int pos = 0;
        while(n != 0) {
            int rem = n % 10;
            n = n / 10;

            int pow = (int)Math.pow(b,pos);
            res = res + (rem * pow);
            pos++;
        }
        
        System.out.println("Output :-");
        return res;
    }
}
