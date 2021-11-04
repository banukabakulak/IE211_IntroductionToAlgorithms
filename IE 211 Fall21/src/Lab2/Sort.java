package Lab2;
import java.time.Clock; 

public class Sort {
	
	 public long runTime;
	
	 public int totalIter = 0;
	
	public Sort() {}
	
	public void InsertionSort(int[] nValues)
	{		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		for(int j = 1; j < nValues.length; j++)
		{
			int key = nValues[j];
			
			int i = j - 1;
			
			while(i >= 0 && nValues[i] > key)
			{
				nValues[i + 1] = nValues[i];
				i--;
				totalIter++;
			}
			
			nValues[i + 1] = key; 
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		System.out.println("The sorted array is: ");
		
		for(int i = 0; i < nValues.length; i++)
			System.out.print(nValues[i] + " ");
		
		System.out.println();
		
		System.out.println("Total iterations: " + totalIter + " The runtime: " + runTime);
			
	}

}
