package Lab4;

public class Search {
	
	public Search() {}
	
	public int BinarySearch(int[] array, int value, int l, int r)
	{
		while (r >= l)
		{
			int m = (l + r) / 2;
			
			if(value == array[m])
				return m;
			else if (value < array[m])
				r = m - 1;
			else 
				l = m+1 ;			
		}
		return -1;
	}

}
