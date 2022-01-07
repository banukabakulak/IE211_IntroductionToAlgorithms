package Lab6_2;

import java.util.ArrayList;
import java.util.List;

public class Lab6_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] U = {1, 2, 3, 4, 5};
		int[] f = {1, 1, 1, 1, 1};
		
		List<int[]> sets = new ArrayList<int[]>();
		
		int[] set1 = {1, 3, 4};
		sets.add(set1);
		int[] set2 = {2, 5};
		sets.add(set2);
		int[] set3 = {1, 2, 3, 4};
		sets.add(set3);
			
		
		int[] p = {5, 10, 3};
		
		System.out.println();
		System.out.println("The sets are ");		
		for(int i = 0; i <sets.size(); i++)
		{
			System.out.println();
			for(int j = 0; j < sets.get(i).length; j++)	
				System.out.print(sets.get(i)[j] + " ");
		}
		
		Coverage setCoverage = new Coverage();
		setCoverage.ImplementAlgorithm(f, sets, p);

	}

}
