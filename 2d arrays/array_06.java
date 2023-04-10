// Rotate by 90 Degree

// Input :-

// 4 --> no. of rows and columns

// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44

// Output :-

// 41 31 21 11
// 42 32 22 12
// 43 33 23 13
// 44 34 24 14



import java.util.Scanner;

public class array_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j  < n ; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        scn.close();
        
        System.out.println("Output :-");
        transpose(mat);
        rotateRowWise(mat);
        display(mat);

    }

    public static void transpose(int mat[][]) {
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void rotateRowWise(int mat[][]) {
        int n = mat.length;
        
        for(int r = 0; r < n; r++) {
            int lo = 0;
            int hi = n-1;
            while(lo <= hi) {
                int temp = mat[r][lo];
                mat[r][lo] = mat[r][hi];
                mat[r][hi] = temp;
                
                lo++;
                hi--;
            }
        }
    }
    
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
