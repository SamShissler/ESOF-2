import java.util.*;

public class MTool{
    int[] toBeSorted;
    int[] temp;
    public int[] mathSort(int[] unsorted){
	toBeSorted = unsorted;
	temp = toBeSorted.clone();
	mergeSort(0, toBeSorted.length-1);
	return toBeSorted;
    }
    public void mergeSort(int low, int high){
	if(low<high){
	    int mid = low+(high-low)/2;
	    mergeSort(low, mid);
	    mergeSort(mid+1, high);
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

