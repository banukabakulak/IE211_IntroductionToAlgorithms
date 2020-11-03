package Lab3;

public class Difference {
	
	public Difference() {}
	
	public void printDifferentElements(int[] array1, int[] array2) 
	{
		System.out.println("The elements of A that are not in B are ");
		
		for(int i = 0; i < array1.length; i++)
		{
			boolean isElement = false;
			for(int j = 0; j < array2.length; j++)
			{
				if(array1[i] == array2[j])
				{
					isElement = true;		
					break;
				}		
			}
			
			if(isElement == false)
				System.out.print(array1[i] + " ");
		}		
	}

}
