package Lab5;

import java.util.List;

public class Coverage {
	
	public Coverage() {}
	
	private boolean isUndercoverage(int[] f)
	{
		boolean underCoverage = false;
		
		for(int i = 0; i < f.length; i++)
			if(f[i] > 0)
				underCoverage = true;
		
		return underCoverage;
	}
	
	public void ImplementAlgorithm(int[] f, List<int[]> sets, int[] p)
	{
		int[] setCollection = new int[p.length];
		
		for(int i =0; i< setCollection.length; i++)
			setCollection[i] = 0;
		
		int totalPrice = 0;
		
		while(isUndercoverage(f))
		{
			int bestI = -1; double bestRatio = -1;
			
			for(int i = 0; i < setCollection.length; i++)
				if(setCollection[i] == 0)
				{
					int totalUnderCoverage = 0;
					
					int[] currSet = sets.get(i);
					
					for(int j = 0; j < currSet.length; j++)
						totalUnderCoverage += f[currSet[j] - 1];
					
					double ratio = totalUnderCoverage * 1.0 / p[i];
					
					if(ratio > bestRatio)
					{
						bestRatio = ratio;
						bestI = i;
					}
				}
			
			if(bestI == -1)
				break;
			else
			{
				totalPrice += p[bestI];
				setCollection[bestI] = 1;
				
				int[] bestSet = sets.get(bestI);
				
				for(int j = 0; j < bestSet.length; j++)
					if(f[bestSet[j] - 1] > 0)
						f[bestSet[j] - 1]--;
			}			
		}

		
		System.out.println();
		System.out.println("The set selections are ");
		for(int i =0; i< setCollection.length; i++)
			System.out.print(setCollection[i] + " ");
		
		System.out.println();
		System.out.println("The undercoverage values are ");			
		for(int j = 0; j < f.length; j++)
			System.out.print(f[j] + " ");
		
		System.out.println();
		System.out.println("The total price is " + totalPrice);
		
	}

}
