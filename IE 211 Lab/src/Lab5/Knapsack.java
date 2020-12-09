package Lab5;

import java.time.Clock;
//import java.awt.List;
import java.util.*;

public class Knapsack {
	
	public class Item implements Comparable<Knapsack.Item>{
		int index;
		double ratio;
		@Override
		public int compareTo(Item it) {
			if(ratio < it.ratio)
			return index;
			else return it.index;
		}
	};
	
	public double[] x;
	
	public long runTime;
	
	List<Knapsack.Item> LItems = new ArrayList<Knapsack.Item> ();
	
	public Knapsack() {}
	
	private void ImplementBinaryKnapsack2(int[] values, int[] volumes, int totalVolume)
	{
		double remainingVolume = totalVolume;
		double totalValue = 0;
		
		x = new double[values.length];
		
		for(int i = 0; i < x.length; i++)
			x[i] = 0;
		
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		// calculate the ratios and sort in non-increasing order 
		LItems.clear();
		for(int i = 0; i < x.length; i++)
		{
			Item item = new Item();
			item.index = i;
			item.ratio = values[i] * 1.0 / volumes[i];
			LItems.add(item);
		}
		
		Collections.sort(LItems, new Comparator<Knapsack.Item>() {
			  @Override
			  public int compare(Knapsack.Item I1, Knapsack.Item I2) {
				  if(I2.ratio > I1.ratio)
					  return 1;
				  else return -1;
			  }
			});
		
		for(int i = 0; i < x.length; i++)
		{
			int currIndex = LItems.get(i).index;
			if(x[currIndex] == 0)
				if(remainingVolume < volumes[currIndex])
					break;
				else 
				{
					x[currIndex] = 1;
					remainingVolume -= volumes[currIndex];
					totalValue += values[currIndex];
				}	
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The results of the Binary Knapsack v2: ");
		System.out.println("The item selections are ");
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		
		System.out.println();
		System.out.println("Total value is " + totalValue);
		
		System.out.println();
		System.out.println("The runtime is " + runTime);
	}
	
	private void ImplementBinaryKnapsack1(int[] values, int[] volumes, int totalVolume)
	{
		double remainingVolume = totalVolume;
		double totalValue = 0;
		
		x = new double[values.length];
		
		for(int i = 0; i < x.length; i++)
			x[i] = 0;
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		while(true)
		{
			int bestI = -1; double bestRatio = -1;
			
			for(int i = 0; i < x.length; i++)
				if(x[i] == 0)
				{
					double ratio = values[i] * 1.0 / volumes[i] ;
					
					if(ratio > bestRatio)
					{
						bestRatio = ratio;
						bestI = i;
					}					
				}
			
			if(bestI == -1)
				break;
			else if(remainingVolume < volumes[bestI])
				break;
			else 
			{
				x[bestI] = 1;
				remainingVolume -= volumes[bestI];
				totalValue += values[bestI];
			}			
		}	
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The results of the Binary Knapsack v1: ");
		System.out.println("The item selections are ");
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		
		System.out.println();
		System.out.println("Total value is " + totalValue);
		
		System.out.println();
		System.out.println("The runtime is " + runTime);
	}
	
	private void ImplementBinaryKnapsack(int[] values, int[] volumes, int totalVolume, boolean isEfficient)
	{
		if(isEfficient)
			ImplementBinaryKnapsack2(values, volumes, totalVolume);
		else 
			ImplementBinaryKnapsack1(values, volumes, totalVolume);			
	}
	
	private void ImplementFractionalKnapsack2(int[] values, int[] volumes, int totalVolume)
	{		
		double remainingVolume = totalVolume;
		double totalValue = 0;
		
		x = new double[values.length];
		
		for(int i = 0; i < x.length; i++)
			x[i] = 0;
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		// calculate the ratios and sort in non-increasing order 
		LItems.clear();
		for(int i = 0; i < x.length; i++)
		{
			Item item = new Item();
			item.index = i;
			item.ratio = values[i] * 1.0 / volumes[i];
			LItems.add(item);
		}
		
		Collections.sort(LItems, new Comparator<Knapsack.Item>() {
			  @Override
			  public int compare(Knapsack.Item I1, Knapsack.Item I2) {
				  if(I2.ratio > I1.ratio)
					  return 1;
				  else return -1;
			  }
			});
		
		for(int i = 0; i < x.length; i++)
		{
			int currIndex = LItems.get(i).index;
			if(x[currIndex] == 0)
				if(remainingVolume < volumes[currIndex])
				{
					x[currIndex] = remainingVolume / volumes[currIndex];
					remainingVolume = 0;
					totalValue += values[currIndex] * x[currIndex];
					break;
				}
				else 
				{
					x[currIndex] = 1;
					remainingVolume -= volumes[currIndex];
					totalValue += values[currIndex];
				}	
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The results of the Fractional Knapsack v2: ");
		System.out.println("The item selections are ");
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		
		System.out.println();
		System.out.println("Total value is " + totalValue);
		
		System.out.println();
		System.out.println("The runtime is " + runTime);
	}
	
	private void ImplementFractionalKnapsack1(int[] values, int[] volumes, int totalVolume)
	{
		double remainingVolume = totalVolume;
		double totalValue = 0;
		
		x = new double[values.length];
		
		for(int i = 0; i < x.length; i++)
			x[i] = 0;
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		while(remainingVolume > 0)
		{
			int bestI = -1; double bestRatio = -1;
			
			for(int i = 0; i < x.length; i++)
				if(x[i] == 0)
				{
					double ratio = values[i] * 1.0 / volumes[i] ;
					
					if(ratio > bestRatio)
					{
						bestRatio = ratio;
						bestI = i;
					}					
				}
			
			if(bestI == -1)
				break;
			else if(remainingVolume >= volumes[bestI])
			{
				x[bestI] = 1;
				remainingVolume -= volumes[bestI];
				totalValue += values[bestI];				
			}
			else 
			{
				x[bestI] = remainingVolume / volumes[bestI];
				remainingVolume = 0;
				totalValue += values[bestI] * x[bestI];
			}			
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The results of the Fractional Knapsack v1: ");
		System.out.println("The item selections are ");
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		
		System.out.println();
		System.out.println("Total value is " + totalValue);
		
		System.out.println();
		System.out.println("The runtime is " + runTime);
	}
	
	private void ImplementFractionalKnapsack(int[] values, int[] volumes, int totalVolume, boolean isEfficient)
	{		
		if(isEfficient)
			ImplementFractionalKnapsack2(values, volumes, totalVolume);
		else 
			ImplementFractionalKnapsack1(values, volumes, totalVolume);		
	}
	
	public void ImplementKnapsack(int[] values, int[] volumes, int totalVolume, boolean isBinary, boolean isEfficient)
	{
		if(isBinary)
			ImplementBinaryKnapsack(values, volumes, totalVolume, isEfficient);
		else
			ImplementFractionalKnapsack(values, volumes, totalVolume, isEfficient); 
	}

}
