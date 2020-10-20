package Algorithm;

public class Sort {
	
	public Sort() {}
	
	public void InsertionSort(int[] nValues)
	{
		for(int j = 1; j < nValues.length; j++)
		{
			int key = nValues[j];
			
			int i = j - 1;
			
			while(i >= 0 && nValues[i] > key)
			{
				nValues[i + 1] = nValues[i];
				i--;
			}
			
			nValues[i + 1] = key; 
		}
		
		System.out.println();
		System.out.println("The sorted array is: ");
		
		for(int i = 0; i < nValues.length; i++)
			System.out.print(nValues[i] + " ");
			
	}

}
