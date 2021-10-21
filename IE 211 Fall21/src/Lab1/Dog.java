package Lab1;

public class Dog extends Animal{
	
	private String genre;
	
	public Dog() {}
	
	public void setGenre(String genreIn)
	{
		genre = genreIn;
	}

	public void isGenre(String genreIn)
	{
		if(genre == genreIn)
			System.out.println("The genre of the dog is " + genreIn);
		else 
			System.out.println("The genre of the dog is not " + genreIn);
	}
	
	public void speak()
	{
		System.out.println("Hav hav!");
	}
}
