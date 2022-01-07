package Lab7;

public class Lab7_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {3, 2, 8, 6};
		int[] volumes = {2, 4, 3, 5};
		
		int totalVolume = 7;
		
		BinaryKnapsack myKnapsack = new BinaryKnapsack();
		myKnapsack.ImplementAlgorithm(values, volumes, totalVolume);

	}

}
