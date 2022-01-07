package Lab7;

public class BinaryKnapsack {
	
	public BinaryKnapsack() {}
	
	public void ImplementAlgorithm(int[] values, int[] volumes, int totalVolume)
	{
		// This function implements the Dynamic Programming algorithm for Binary Knapsack Problem. 
		
		int[][] bestV = new int[values.length][totalVolume + 1];
		int[][] selectDecision = new int[values.length][totalVolume + 1];
		
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
						int selectValue = values[i] + bestV[i - 1][w - volumes[i]];
						int notSelectValue = bestV[i - 1][w]; 
						
						if(selectValue > notSelectValue)
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
		
		int[] x = new int[values.length];
		
		int currVolume = totalVolume;
		
		for(int i = values.length - 1; i >= 0; i--)
			if(selectDecision[i][currVolume] > 0)
			{
				currVolume -= volumes[i];
				x[i] = 1;
			}
			else
				x[i] = 0;
		
		System.out.println();
		System.out.println("Total value is " + bestV[values.length - 1][totalVolume]);
		
		System.out.println();
		System.out.println("The item selections are ");
		for(int i = 0; i < values.length; i++)
			System.out.print(x[i] + " ");	
	}
}
