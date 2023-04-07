// Matrix Multiplication

// Input :-

// 2 --> no. of rows
// 3 --> no. of columns
// 10  0  0
// 0  20  0

// 3 --> no. of rows
// 4 --> no. of columns
// 1  0  1  0
// 0  1  1  2
// 1  1  0  0

// Output :-

// 10 0 10 0
// 0 20 20 40


import java.util.Scanner;

public class array_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        
        int mat1[][] = new int[nr1][nc1];
        for(int i = 0 ; i < nr1 ; i++) {
            for(int j = 0 ; j < nc1 ; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }
        
        int nr2 = scn.nextInt();
        int nc2 = scn.nextInt();

        int mat2[][] = new int[nr2][nc2];
        for(int i = 0 ; i < nr2 ; i++) {
            for(int j = 0 ; j < nc2 ; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("Output :-");
        if(nc1 == nr2) {
            int res[][] = new int[nr1][nc2];
            for(int i = 0 ; i < res.length ; i++) {
                for(int j = 0 ; j < res[0].length ; j++) {
                    for(int k = 0 ; k < nc1 ; k++) {
                        res[i][j] = res[i][j] + (mat1[i][k] * mat2[k][j]);
                    }
                }
            }
            for(int i = 0 ; i < res.length ; i++) {
                for(int j = 0 ; j < res[0].length ; j++) {
                    System.out.print(res[i][j] + " ");
                }
                
                System.out.println();
            }
        }
        else {
            System.out.println("Invaild input");
        }

        scn.close();
    }
}
