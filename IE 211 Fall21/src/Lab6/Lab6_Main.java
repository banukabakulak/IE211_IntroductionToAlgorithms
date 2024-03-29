package Lab6;

import java.util.*;

public class Lab6_Main {
	
	final static int SIZE = 4;
	final static int MAX_VALUE = 40;
	final static int MAX_VOLUME = 30; 
	
	public static void SolveKnapsackProblem()
	{
		int[] values = new int[SIZE];
		int[] volumes = new int[SIZE];
		
		int totalVolume = (MAX_VOLUME / 2) * SIZE;
		
		Random rand = new Random();
		
		for(int i = 0; i < values.length; i++)
		{
			values[i] = rand.nextInt(MAX_VALUE + 1);
			volumes[i] = rand.nextInt(MAX_VOLUME - 10) + 10;
		}
		
		System.out.println("The values of the items are ");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		
		System.out.println();
		System.out.println("The volumes of the items are ");
		for(int i = 0; i < volumes.length; i++)
			System.out.print(volumes[i] + " ");
		
		System.out.println();
		System.out.println("The total volume is " + totalVolume);
		
		 Knapsack myKnapsack = new Knapsack();
		 // Binary knapsack with two versions, i.e., O(n^2) and O(nlogn)
		 myKnapsack.ImplementKnapsack(values, volumes, totalVolume, true, false);
		 myKnapsack.ImplementKnapsack(values, volumes, totalVolume, true, true);
		 
		// Fractional knapsack with two versions, i.e., O(n^2) and O(nlogn)
		 myKnapsack.ImplementKnapsack(values, volumes, totalVolume, false, false);
		 myKnapsack.ImplementKnapsack(values, volumes, totalVolume, false, true);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		SolveKnapsackProblem();

	}

}

