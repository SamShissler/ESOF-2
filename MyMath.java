public class MyMath implements EducationalMathematicsSoftware{
    public int[] mathSort(int[] unsorted){
	boolean sorted = false;
	while(!sorted){
	    sorted = true;
	    for(int i=0; i<unsorted.length-1; i++){
		if(unsorted[i]>unsorted[i+1]){
		    int temp = unsorted[i];
		    unsorted[i] = unsorted[i+1];
		    unsorted[i+1] = temp;
		    sorted = false;
		}
	    }
	}
	return unsorted;
    }
}
