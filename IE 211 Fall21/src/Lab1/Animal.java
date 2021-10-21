package Lab1;

abstract class Animal {

	private String name;
	private int id;

	public Animal() {}
	
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public void setID(int idIn)
	{
		id = idIn;
	}
	
	public int getIDLastDigit()
	{
		return id % 10;
	}
	
	public abstract void speak();
	
}
