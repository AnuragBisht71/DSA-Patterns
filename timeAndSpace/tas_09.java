// Sort 01

// Input :-

// 10 --> no. of element in array
// 1
// 0
// 2
// 2
// 1
// 0
// 2
// 1
// 0
// 2

// Output :-

// 0
// 0
// 0
// 1
// 1
// 1
// 2
// 2
// 2
// 2



package timeAndSpace;

public class tas_09 {
    int i = 0 , j = 0 , k = arr.length - 1;

    while(i <= k) {
        if(arr[i] == 0) {
            swap(arr,i,j);
            i++;
            j++;
        } 

        else if(arr[i] == 1) {
            i++;
        }

        else if(arr[i] == 2) {
            swap(arr,i,k);
            k--;
        }

    }
}
