package Lab4;

public class Sort {
	
	final int bigM = 10000;
	
	public Sort() {}
	
	public void implementMergeSort(int[] array, int p, int r)
	{
		if(p < r)
		{
			int q = (p + r) / 2;
			
			//System.out.println(q);
			
			implementMergeSort(array, p, q);
			implementMergeSort(array, q+1, r);
			implementMerge(array, p, q, r);
		}
	}
	
	
	public void implementMerge(int[] array, int p, int q, int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] leftArray = new int[n1+1];
		int[] rightArray = new int[n2+1];
		
		for(int i = 0; i < n1; i++)
			leftArray[i] = array[p + i];
		
		leftArray[n1] = bigM;
		
		for(int j = 0; j < n2; j++)
			rightArray[j] = array[q + j + 1];
		
		rightArray[n2] = bigM;
		
//		System.out.println();
//		System.out.println("the left array is ");
//		
//		for(int i = 0; i < leftArray.length; i++)
//			System.out.print(leftArray[i] + " ");
//		
//		System.out.println();
//		System.out.println("the right array is ");
//		
//		for(int j = 0; j < rightArray.length; j++)
//			System.out.print(rightArray[j] + " ");
		
		int i = 0; int j = 0;
		
		for(int k = p; k < r + 1; k++)
			if(leftArray[i] <= rightArray[j])
			{
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;				
			}
		
	}
}
