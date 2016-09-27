public class Mathematica implements EducationalMathematicsSoftware{
    //Mathematica is an EducationalMathematicsSoftware, so it is required to have a mathSort method
    //Mathematica uses insertion sort, so the mathSort method implements insertion sort.
    public int[] mathSort(int[] unsorted){
	for(int i = 1; i < unsorted.length; i++){
	    //index keeps track of the current spot in the array so that when the
	    //  first part of the array is sorted, the algorithm can continue.
	    int index = i;
	    //The second loop decrements through the beginning of the array
	    //  starting with i.
	    for(int j = i-1; j >= 0; j--){
		if(unsorted[i]<unsorted[j]){
		    //Swaps i with j
		    int temp = unsorted[j];
		    unsorted[j] = unsorted[i];
		    unsorted[i] = temp;
		    i--; // decrements i
		} //decrements j
	    }
	    i = index; //Sets i equal to the original i so the sort continues.
	}
	return unsorted; //returns the sorted array
    }
}
