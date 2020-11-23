package Lab4;

import java.time.Clock;
import java.util.Random;

public class Lab4 {
	
	final static int SIZE = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[SIZE];
		
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i++) 
		{			
			array[i] = rand.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		Clock clock = Clock.systemDefaultZone();
		double runTime  = clock.millis();

		Sort mergeSort = new Sort();
		mergeSort.implementMergeSort(array, 0, array.length - 1);
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The sorted array is ");
		
		for(int i = 0; i < array.length; i++) 			
			System.out.print(array[i] + " ");

		System.out.println();
		System.out.println("The runtime of Merge Sort is: " + runTime);
		
		System.out.println();
		int[] testValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		

		runTime  = clock.millis();
		
		System.out.println();
		System.out.println("the indices are ");
		
		for(int i = 0; i< testValues.length; i++)
		{
			Search mySearch = new Search();
			System.out.print(mySearch.BinarySearch(array, testValues[i], 0, array.length - 1) + " ");		
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The runtime of Binary Search is: " + runTime);
			
	}

}
