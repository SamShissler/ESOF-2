import javax.swing.*;

public class MathSort{
    int[] unsorted = new int[]{52,4,86,85,5,4,5000000,452,8,2,45,86372,8370,5,875,87,0};
    public MathSort(){
	int[] sorted = getInput();
	JOptionPane.showMessageDialog(null, "Your sorted array is: \n    " + sorted.toString(), "Yay, it worked", JOptionPane.PLAIN_MESSAGE);
    }
    public int[] getInput(){
	String input = JOptionPane.showInputDialog(null, "Please select a math program to sort your integers:\nEnter either \'Mathematica\', \'MTool\', or \'MyMath\'.");
	if(input.equals("Mathematica")){
	    return new Mathematica().mathSort(unsorted);
	}else if(input.equals("MTool")){
	    return new MTool().mathSort(unsorted);
	}else if(input.equals("MyMath")){
	    return new MyMath().mathSort(unsorted);
	    }
	JOptionPane.showMessageDialog(null,"That's an invalid input", "Please Try Again", JOptionPane.ERROR_MESSAGE);
	return getInput();
    }
    public static void main(String[] args){
	MathSort f1 = new MathSort();
    }
}
