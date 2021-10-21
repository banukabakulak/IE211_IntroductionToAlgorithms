package Lab1;

public class Main_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!");
		
		// ENCAPSULATION => Grouping the variables and the methods, i.e., class definition.
//		Animal myPet = new Animal(); 
		
//		// Public data updates 
//		myPet.name = "Kitty";
//		myPet.id = 1484;
//		System.out.println("The pet has name " + myPet.name + " with id " + myPet.id);
		
//		// Private data updates => ABSTRACTION, DATA HIDING 
//		myPet.setName("Kitty");
//		myPet.setID(1484);
//		
//		System.out.println("Last digit of the ID is " + myPet.getIDLastDigit());
		
		// INHERITANCE 
		Animal myCat = new Cat();
		Animal myDog = new Dog();
		
		((Cat)myCat).setAge(10);
		((Cat)myCat).isYoungerThan(15);
		
		((Dog)myDog).setGenre("Golden");
		((Dog)myDog).isGenre("Terrier");
		
		// POLYMORPHISM 
		myCat.speak();
		myDog.speak();
		
	}
}
