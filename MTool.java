import java.util.*;

public class MTool{
    //MTool implements merge sort.
    int[] toBeSorted;
    int[] temp;
    public int[] mathSort(int[] unsorted){
	toBeSorted = unsorted;
	temp = toBeSorted.clone();
	//Starts the recursive call that breaks the array into smaller arrays
	mergeSort(0, toBeSorted.length-1);
	return toBeSorted;
    }
    public void mergeSort(int low, int high){
	if(low<high){
	    int mid = low+(high-low)/2;
	    //Breaks the array in the middle
	    mergeSort(low, mid);
	    mergeSort(mid+1, high);
	    //Calls the method that recombines the smaller arrays into smaller sorted arrays
	    // and eventually back into one big sorted array.
	    combine(low, mid, high);
	}
    }
    public void combine(int low, int mid, int high){
	for(int i=low; i<=high; i++){
	    temp[i] = toBeSorted[i];
	}
	int l = low;
	int m = mid+1;
	int index = low;
	//Checks to see which of the two sorted arrays contains the smallest value
	//  and places it at the front of the new array.
	while(l<=mid && m<=high){
	    if(temp[l] < temp[m]){
		toBeSorted[index] = temp[l];
		l++;
	    }else{
		toBeSorted[index] = temp[m];
		m++;
	    }
	    index++;
	}
	while(l<=mid){
	    toBeSorted[index] = temp[l];
	    l++;
	    index++;
	}
    }
}

