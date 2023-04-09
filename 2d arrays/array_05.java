// Exit point of a Matrix

// Input :-

// 4 --> no. of rows
// 4 --> no. of columns
// 0  0  1  0
// 1  0  0  0
// 0  0  0  0
// 1  0  1  0

// Output :-

// 1
// 3



import java.util.Scanner;

public class array_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++) {
            for(int j = 0 ; j < nc ; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int i = 0 , j = 0 , dir = 0;
        int prevI = -1;
        int prevJ = -1;

        while(i >= 0 && j >= 0 && i < nr && j < nc) {
            dir = (dir + mat[i][j]) % 4;
            prevI = i;
            prevJ = j;

            if(dir == 0) {
                j++;
            }

            else if(dir == 1) {
                i++;
            }

            else if(dir == 2) {
                j--;
            }

            else if(dir == 3) {
                i--;
            }
        }
        
        System.out.println("Output :-");
        System.out.println(prevI);
        System.out.println(prevJ);


        scn.close();
    }
}
