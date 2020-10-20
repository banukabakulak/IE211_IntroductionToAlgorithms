package Lab2;

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
		
//		// test the Binary() function 
//		Binary(12);
//		
//		for(int i = binVal.size() - 1; i >= 0; i--)
//			System.out.print(binVal.get(i) + " ");
//		
//		// end of test
		
		
		setSize = set.length;
		
		System.out.println();
		
		Clock clock = Clock.systemDefaultZone();
		runTime  = clock.millis();
		
		for(int j = 0; j < Math.pow(2,setSize); j++ )
		{
			binVal.clear();
			
			Binary(j);
			
//			for(int i = 0; i< binVal.size(); i++)
//				System.out.print(binVal.get(i) + " ");
			
			System.out.println("The " + j + "th subset is: ");
			
			for(int i = 0; i< binVal.size(); i++)
				if((int)binVal.get(i) > 0)
					System.out.print(set[i] + " ");
			
			System.out.println();
		}
		
		runTime = clock.millis() - runTime;
		
		System.out.println();
		
		System.out.println("The runtime: " + runTime);		
		
	}

}
