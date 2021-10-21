package Lab1;

public class Cat extends Animal{
	
	private int age;
	
	public Cat(){}
	
	public void setAge(int ageIn)
	{
		age = ageIn;
	}
	
	public void isYoungerThan(int ageIn)
	{
		if(age < ageIn)
			System.out.println("The cat is younger than " + ageIn);
		else 
			System.out.println("The cat is older than " + ageIn);
	}

	public void speak()
	{
		System.out.println("Miyavv!");
	}
}
