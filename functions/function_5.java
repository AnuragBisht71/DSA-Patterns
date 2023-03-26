// Any base addition

// Input :-

// 8 --> base
// 777 --> n1 
// 1 --> n2

// Output :-

// 1000


package functions;

import java.util.Scanner;

public class function_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        int res = 0;
        int pos = 1;
        int carry = 0;

        while(n1 != 0 || n2 != 0 || carry != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            int digit = sum % b;
            carry = sum / b;

            res = res + (digit * pos);
            n1 = n1 / 10;
            n2 = n2 / 10;
            pos = pos * 10;
            
        }
        
        System.out.println("Output :-");
        return res;
    }
}
