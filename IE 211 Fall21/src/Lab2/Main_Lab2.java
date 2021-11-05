package Lab2;

import java.util.Random;

public class Main_Lab2 {
	
	final static int SIZE = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		
//		// STEP 1: Way 1: Create input instance - Constant array size 
//		
//		int[] nValues = {5, 2, 4, 6, 1, 3};
//		
//		nValues[2] = 10;
//		
//		for(int i = 0; i < nValues.length; i++)
//			System.out.print(nValues[i] + " ");
		
		// STEP 1: Way 2: Create input instance randomly 
		
		int[] nValues = new int[SIZE];
		
		Random rand = new Random();
		
		for(int i = 0; i < nValues.length; i++)
		{
			// randomly generate values between [0, 50)
			nValues[i] = rand.nextInt(50);
			
			System.out.print(nValues[i] + " ");
		}
		
		// STEP 2: Implement Insertion Sort by calling the function of the Sort class.
		
		Sort insertionSort = new Sort();
		insertionSort.ImplementAlgorithm(nValues);

	}

}
