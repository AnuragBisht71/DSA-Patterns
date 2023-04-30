// Remove Primes

// Input :-

// 4 --> no. of elements
// 3 12 13 15

// Output :-

// [12, 15]



package strings_stringbuilder_arraylist.strings.strings.strings_stringbuilder;


import java.util.ArrayList;
import java.util.Scanner;

public class string_05 {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");
        
		int n = scn.nextInt();
        
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
		}

        System.out.println("Output :-");
		solution(al);
		System.out.println(al);

        scn.close();
	}
    
    public static boolean isPrime(int val) {
        for(int div = 2; div*div <= val; div++) {
            if(val%div==0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al){
		for(int idx = al.size()-1; idx >= 0; idx--) {
		    int val = al.get(idx);
		    if(isPrime(val)) {
		        al.remove(idx);
		    }
		}
		
	}
}


