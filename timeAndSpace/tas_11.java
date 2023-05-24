// Merge Sort

// Input :-

// 5 --> no. of elements in an array
// 7
// -2
// 4
// 1
// 3

// Output :-

// -2
// 1
// 3
// 4
// 7



package timeAndSpace;

public class tas_11 {
    if(lo == hi) {
        return new int[]{arr[lo]};
    }

    int mid = (lo + hi) / 2;

    int lp[] = mergeSort(arr,lo,mid);
    int rp[] = mergeSort(arr,mid+1,hi);

    return mergeTwoSortedArrays(lp , rp);
}
