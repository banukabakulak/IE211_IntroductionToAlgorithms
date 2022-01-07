package Lab7;

import java.time.Clock;

public class BinaryKnapsack {
	
	public int[] x;
	
	public double[][] bestV;
	
	private int[][] selectDecision;
	
	public double runTime;
	
	private void ImplementDynamicProgrammingBinaryKnapsack(int[] values, int[] volumes, int totalVolume)
	{
		bestV = new double[values.length][totalVolume + 1];
		selectDecision = new int[values.length][totalVolume + 1];
		
		x = new int[values.length];
				
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		for(int w = 0; w <= totalVolume; w++)
			for(int i = 0; i < values.length; i++)
			{
				bestV[i][w] = 0;
				selectDecision[i][w] = 0;
				
				if(w < volumes[i])
				{
					if(i > 0)
						bestV[i][w] = bestV[i - 1][w];
				}
				else 
				{
					if(i == 0)
					{
						bestV[i][w] = values[i];
						selectDecision[i][w] = 1;
					}
					else
					{
						double notSelectValue = bestV[i - 1][w];
						double selectValue = values[i] + bestV[i - 1][w - volumes[i]];
						
						if(selectValue >= notSelectValue)
						{
							bestV[i][w] = selectValue;
							selectDecision[i][w] = 1;
						}
						else
						{
							bestV[i][w] = notSelectValue;
							selectDecision[i][w] = 0;
						}
					}
				}
			}	
		
		for(int w = 0; w <= totalVolume; w++)
		{
			int currVolume = totalVolume;
			
			for(int i = values.length - 1; i >= 0; i--)
				if(selectDecision[i][currVolume] > 0)
				{
					currVolume -= volumes[i];					
					x[i] = 1;	
				}
				else
					x[i] = 0;
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		
		System.out.println("The runtime: " + runTime);
		
		System.out.println();
		System.out.println("Total value is " + bestV[values.length - 1][totalVolume] );
		
		System.out.println();
		System.out.println("The item selections are ");
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");	
	}
	
	public void ImplementKnapsack(int[] values, int[] volumes, int totalVolume)
	{
		ImplementDynamicProgrammingBinaryKnapsack(values, volumes, totalVolume);
	}

}

