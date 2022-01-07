package Lab7;

public class Lab7_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {3, 2, 8, 6}; 
		int[] volumes = {2, 4, 3, 5};
		
		int totalVolume = 7;
			
		System.out.println("The values of the items are ");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		
		System.out.println();
		System.out.println("The volumes of the items are ");
		for(int i = 0; i < volumes.length; i++)
			System.out.print(volumes[i] + " ");
		
		System.out.println();
		System.out.println("The total volume is " + totalVolume);
		
		 BinaryKnapsack myKnapsack = new BinaryKnapsack();
		 myKnapsack.ImplementKnapsack(values, volumes, totalVolume);

	}

}
