public class Mathematica implements EducationalMathematicsSoftware{
    public int[] mathSort(int[] unsorted){
	for(int i = 1; i < unsorted.length; i++){
	    int index = i;
	    for(int j = i-1; j >= 0; j--){
		if(unsorted[i]<unsorted[j]){
		    int temp = unsorted[j];
		    unsorted[j] = unsorted[i];
		    unsorted[i] = temp;
		    i--;
		}
	    }
	    i = index;
	}
	return unsorted;
    }
}
