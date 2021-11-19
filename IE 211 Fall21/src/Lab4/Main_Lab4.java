package Lab4;

public class Main_Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");

		
		int[] array1 = {13, 21, 36, 48, 42, 15};
		
		int[] array2 = {10, 12, 13, 14, 15, 16};
		
		System.out.println();
		System.out.println("the first array is ");
		for(int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
		
		System.out.println();
		System.out.println("the second array is ");
		for(int i = 0; i < array2.length; i++)
			System.out.print(array2[i] + " ");
		
		System.out.println();
		
		Difference myDiff = new Difference();
		myDiff.printDifferentElements(array1, array2);
	}

}
