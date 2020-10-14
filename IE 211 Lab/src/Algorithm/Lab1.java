package Algorithm;

import java.util.Random;

public class Lab1 {
	
	final static int SIZE = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// STEP 1: Create input instance randomly
		
		System.out.println("The initial sequence is : ");
		
		int[] nValues = new int[SIZE];
		
		Random rand = new Random();
		
		for(int i = 0; i < nValues.length; i++)
		{
			// randomly generate values between [0, 50)
			nValues[i] = rand.nextInt(50);
			
			System.out.print(nValues[i] + " ");
		}
		
		// STEP 2: Implement Insertion Sort by calling the function of the Sort class
		
		Sort insertionSort = new Sort();
		insertionSort.InsertionSort(nValues);

	}

}





















/*
package Algorithm;
import java.util.Random;

public class Lab1 {

	static final int SIZE = 100;
	
	static final int TRIAL = 10;
	
	public static void main(String[] args) {
		
		int[] instanceSize = new int[TRIAL];
		
		for(int i = 0; i < instanceSize.length; i++) 
		{
			instanceSize[i] = (int)Math.pow(2, i + 4);
			System.out.print(instanceSize[i] + " ");
		}
		System.out.println();
		
		
		for(int l = 0; l < instanceSize.length; l++) 
		{		
		
			System.out.println("The initial sequence is: ");
			
			//int[] nValues = new int[SIZE]; 
			
			int[] nValues = new int[instanceSize[l]]; 
			
			Random rand = new Random();
			
			for(int i = 0; i < nValues.length; i++) 
			{
				// Obtain a number between [0 - 49].
				nValues[i] = rand.nextInt(50);
				System.out.print(nValues[i] + " ");
			}
			
			System.out.println();
			
			Sort sortNumbers = new Sort();
			sortNumbers.InsertionSort(nValues);	
		}
	}

}
*/
