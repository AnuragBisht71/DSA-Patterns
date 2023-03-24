package functions;
// Convert number n of base1 to base2

// Input:-

// 111001 --> number
// 2 --> base1
// 3 --> base2

// Output :-

// 2010


import java.util.Scanner;

public class function_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        scn.close();
    }
}
