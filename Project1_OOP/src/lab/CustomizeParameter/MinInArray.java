package lab.CustomizeParameter;

public class MinInArray {

	public static void main(String[] args) {
		double[] array = {5,6,8,1,3,9};
		int index = minWay1(array);
		System.out.println(index);
		
		int sumEven = getSumEven(array);
		System.out.println(sumEven); 
		
		int index2 = minWay2(array);
		System.out.println(index2);
	}

	/**
	 * - Problem: Parameter transform: double...array 
	 * - Question: user can find min in array?
	 * - Solution: in the array has the number of 
	 * self-defined element, example in main: 
	 * int index = min(5,7,8,2,3,9);
	*/
	private static int minWay2(double...array) {
		double min = array[0];
		int index = 0;
		
		for(int i=1;i<array.length;i++){
			if(array[i]<min){
				min = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	private static int getSumEven(double[] array) {
		int sumEven = 0;
		
		for(int i=1;i<array.length;i++){
			if(array[i]%2==0){
				sumEven += array[i];
			}
		}
		
		return sumEven;
	}

	private static int minWay1(double[] array) {
		double min = array[0];
		int index = 0;
		
		for(int i=1;i<array.length;i++){
			if(array[i]<min){
				min = array[i];
				index = i;
			}
		}
		
		return index;
	}

}
