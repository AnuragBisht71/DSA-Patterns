// Search In A Sorted 2d Array

// Input -

// 4 --> no. of rows & columns

// 11  12  13  14
// 21  22  23  24
// 31  32  33  34
// 41  42  43  44

// 43 --> find its coordinates

// Output :-

// 3
// 2



import java.util.Scanner;

public class array_08 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter input :-");

            int n = scn.nextInt();
            int mat[][] = new int[n][n];
            for(int i = 0 ; i < n ; i++) {
                for(int j = 0 ; j < n ; j++) {
                    mat[i][j] = scn.nextInt();
                }
            }

            int x = scn.nextInt();
            int i = 0;
            int j = n-1;

            while(j >= 0 && i < n) {
                if(mat[i][j] == x) {
                    System.out.println("Output :-");
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
                else if(x > mat[i][j]) {
                    i++;
                }
                else if(x < mat[i][j]) {
                    j--;
                }
            }

            System.out.println("Not Found");

            scn.close();
        }
    }
}
