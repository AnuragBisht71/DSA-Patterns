// The State of Wakanda - 1

// Input :-

// 3 --> no. of rows
// 4 --> no. of columns
// 11  12  13  14 
// 21  22  23  24 
// 31  32  33  34

// Output :-

// 11
// 21
// 31
// 32
// 22
// 12
// 13
// 23
// 33
// 34
// 24
// 14


import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++) {
            for(int j = 0 ; j < nc ; j++) {
                mat[i][j]= scn.nextInt();
            }
        }
        
        System.out.println("Output :-");
        for(int c = 0 ; c < nc ; c++) {

            if(c % 2 == 0) {
                for(int r = 0 ; r <= nr-1 ; r++) {
                    System.out.println(mat[r][c]);
                }
            }
            else {
                for(int r = nr-1 ; r >= 0 ; r--) {
                    System.out.println(mat[r][c]);
                }
            }
        }

        scn.close();
    }
}
