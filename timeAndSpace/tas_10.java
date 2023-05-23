// Partition on Array

// Input :-

// 5 --> elements of array
// 7
// -2
// 4
// 1
// 3
// 3 --> partition on this number

// Output :-

// -2
// 1
// 3
// 7
// 4



package timeAndSpace;

public class tas_10 {
    int i = 0 , j = 0 ;

    while(i < arr.length) {
        if(arr[i] > pivot) {
            i++;
        }

        else {
            swap(arr,i,j);
            i++;
            j++;
        }
    }
}
