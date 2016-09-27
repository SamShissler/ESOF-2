public class Mathematica implements EducationalMathematicsSoftware{
    public int[] mathSort(int[] unsorted){
	for(int i = 1; i < unsorted.length; i++){
	    int index = i;
	    for(int j = i-1; j >= 0; j--){
		System.out.println("i = "+unsorted[i] +", j = "+unsorted[j]);
		if(unsorted[i]<unsorted[j]){
		    System.out.println("Swap");
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
