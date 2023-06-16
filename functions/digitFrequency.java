// Input :-

// 994543234 --> Number
// 4 --> Calculate digit frequency

// Output :-

// 3



package functions;

import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter input");

            int n = scn.nextInt();
            int d = scn.nextInt();
            int f = getDigitFrequency(n, d);
            System.out.println(f);
        }
    }

    public static int getDigitFrequency(int n, int d) {
        
        int count = 0;
        while(n != 0) {
            int rem = n % 10;
            n = n / 10;

            if(rem == d) {
                count++;
            }
        }
        
        System.out.println("Output :-");
        return count;
    }
}
