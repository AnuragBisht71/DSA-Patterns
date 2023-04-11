// The State of Wakanda-2

// Input :-

// 4 --> no. of rows & columns

// 11  12  13  14
// 21  22  23  24
// 31  32  33  34
// 41  42  43  44

// Output :-

// 11
// 22
// 33
// 44
// 12
// 23
// 34
// 13
// 24
// 14



import java.util.Scanner;

public class array_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        System.out.println("Output :-");
        for(int gap = 0 ; gap < n ; gap++) {
            for(int r = 0 , c = gap ; r < n && c < n ; r++ , c++) {
                System.out.println(mat[r][c]);
            }
        }

        scn.close();
    }
}
