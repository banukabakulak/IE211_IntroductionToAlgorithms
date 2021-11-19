package Lab3;

import java.util.Vector;
import java.time.Clock; 

public class Subset {
	
	private int setSize;
	
	private double runTime;
	
	private Vector binVal;
	
	public Subset() 
	{
		binVal = new Vector();
	}
	
	private void Binary(int n)
	{
		if(n > 1)
			Binary(n/2);
		
		binVal.add(0, n % 2);
	}
	
	public void GenerateSubsets(int[] set)
	{
		System.out.println();
		
		// test the Binary() function 
		Binary(12);
		
		for(int j = binVal.size() - 1; j >= 0; j--)
			System.out.print(binVal.get(j) + " ");
		
		// end of test
		
		
		setSize = set.length;
		
		System.out.println();
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		for(int i = 0; i < Math.pow(2,setSize); i++ )
		{
			binVal.clear();
			
			Binary(i);
			
//			for(int j = 0; j< binVal.size(); j++)
//				System.out.print(binVal.get(j) + " ");
			
			System.out.println("The " + i + "th subset is: ");
			
			for(int j = 0; j< binVal.size(); j++)
				if((int)binVal.get(j) > 0)
					System.out.print(set[j] + " ");
			
			System.out.println();
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		
		System.out.println("The runtime: " + runTime);		
		
	}

}

