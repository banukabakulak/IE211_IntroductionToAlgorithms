package Lab2;

import java.util.Random;

public class Lab2 {
	
	final static int SIZE = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
			
		// SUBSET GENERATION ALGORITHM 
		
		// STEP 1: Create input instance randomly 
		
		int[] set = new int[SIZE];
			
		for(int i = 0; i < set.length; i++) 
		{			
			set[i] = 2 *i + 1;
			System.out.print(set[i] + " ");
		}
		
		// STEP 2: Implement Subset Generation by calling the function of Subset class
		
		Subset mySubsets = new Subset();
		
		mySubsets.GenerateSubsets(set);
		
		
		
		
//		// STEP 1: Create input instance randomly
//		
//		System.out.println("The initial sequence is : ");
//		
//		int[] nValues = new int[SIZE];
//		
//		for(int i = 0; i < nValues.length; i++)
//		{
//			// randomly generate values between [0, 50)
//			nValues[i] = rand.nextInt(50);
//			
//			System.out.print(nValues[i] + " ");
//		}
//		
//		// STEP 2: Implement Insertion Sort by calling the function of the Sort class
//		
//		Sort insertionSort = new Sort();
//		insertionSort.InsertionSort(nValues);	

	}

}




















