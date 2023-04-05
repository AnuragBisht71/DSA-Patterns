// 2D Array Demo

// Input :-

// 2 --> no. of rows
// 4 --> no. of columns
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24

// Output :-

// 11 12 13 14
// 21 22 23 24

// package 2d arrays;


import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter input :-");

            int nr = scn.nextInt();
            int nc = scn.nextInt();

            int mat[][] = new int[nr][nc];
            for(int i = 0; i < nr; i++) {
                for(int j = 0 ; j < nc; j++) {
                    mat[i][j] = scn.nextInt();
                }
            }
            
            System.out.println("Output :-");
            
            for(int i = 0 ; i < nr ; i++) {
                for(int j = 0 ; j < nc ; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
