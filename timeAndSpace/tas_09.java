package timeAndSpace;

public class tas_09 {
    int i = 0 , j = 0 , k = arr.length - 1;

    while(i <= k) {
        if(arr[i] == 1) {
            swap(arr,i,j);
            i++;
            j++;
        } 

        else if(arr[i] == 2) {
            swap(arr,i,k);
            i++;
            k--;
        }

        else {
            i++;
        }
    }
}
