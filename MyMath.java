public class MyMath implements EducationalMathematicsSoftware{
    //MyMath implements bubble sort
    public int[] mathSort(int[] unsorted){
	//sets a boolean that keeps track of whether the array is sorted or not.
	boolean sorted = false;
	while(!sorted){
	    //If there are no changes to the order of the array, the array is sorted.
	    sorted = true;
	    for(int i=0; i<unsorted.length-1; i++){
		if(unsorted[i]>unsorted[i+1]){
		    int temp = unsorted[i];
		    unsorted[i] = unsorted[i+1];
		    unsorted[i+1] = temp;
		    //When the array is changed the boolean is set to false.
		    sorted = false;
		}
	    }
	}
	return unsorted;
    }
}
