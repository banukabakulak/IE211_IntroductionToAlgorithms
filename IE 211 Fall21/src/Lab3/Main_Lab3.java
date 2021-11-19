package Lab3;

import java.util.Random;

public class Main_Lab3 {
	
	final static int SIZE = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!");
		
		Random rand = new Random();
		
		// SUBSET GENERATION ALGORITHM 
		
		// STEP 1: Create input instance randomly 
		
		int[] set = new int[SIZE];
			
		for(int i = 0; i < set.length; i++) 
		{			
			set[i] = 2 *i + 1;
			//set[i] = rand.nextInt(50); 
			System.out.print(set[i] + " ");
		}
		
		// STEP 2: Implement Subset Generation by calling the function of Subset class
		
		Subset mySubsets = new Subset();
		
		mySubsets.GenerateSubsets(set);
		
	}

}
