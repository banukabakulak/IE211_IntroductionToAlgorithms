package Lab8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
	
	public DataStructures() {}
	
	private class Point
	{
		private double x = 4;
		private double y = 1;
		
		public void printCoordinates()
		{
			System.out.println("the coordinates of the point are (" + x + ", " + y + ")");
		}
		
		public void updateCoordinates()
		{
			x = 2*x;
			y = 3*y;
			System.out.println("the updated coordinates of the point are (" + x + ", " + y + ")");
		}
		
	};
	
	private void DataTypes()
	{
		boolean boolVar = true;
		char character = 0x2F; // 35; //'a'; // '5'; '!';
		
		System.out.println("the bool data is " + boolVar);
		System.out.println("the char data is " + character);
		
		String myString = "'Hello World!'";
		
		System.out.println("the string data is " + myString);
		
		byte byteVar = 127; // 8-bit 		
		System.out.println("the byte data is " + byteVar);
		
		short shortVar = 32767; // 16-bit 		
		System.out.println("the short data is " + shortVar);
		
		int intVar = 2147483647; // 32-bit 		
		System.out.println("the int data is " + intVar);
		
		long longVar = 21474836; //9223372036854775807; // 64-bit 		
		System.out.println("the long data is " + longVar);
		
		double floatVar = 10.56;  // 32-bit
		double doubleVar = 100.56;  // 64-bit
		
		Point myPoint = new Point();
		
		myPoint. printCoordinates();
		myPoint.updateCoordinates();	
	}
	
	private void ArrayTest()
	{
		int[] intArray = new int[3];
		double[] doubleArray = new double[14];
		
		intArray[0] = 3;
		intArray[1] = 5;
		intArray[2] = 6;
		
		System.out.println("the array is ");
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");		
	}
	
	private void LinkedListTest()
	{
		LinkedList<String> object = new LinkedList<String>();
		
		
		// INSERT, O(n)-time
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D"); // head insertion, O(1)-time
		object.add(2, "E");
		object.add("F");
		object.add("G");
		
		System.out.println("Linked list is " + object);
		
		
		// REMOVE, O(n)-time
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();

		System.out.println("Linked list is " + object);
		
		//SEARCH, O(n)-time
		
		boolean status = object.contains("E");
		
		if(status)
			System.out.println("list contains element 'E' ");
		else
			System.out.println("list does not contain element 'E' ");
		
		// number of elements in the linked list
		System.out.println("size of the linked list " + object.size());
		
		// get and set the elements form linked list
		
		//String currString = object.get(2);
		
		Object element = object.get(2);
		
		System.out.println("the current element is " + element);
		
		object.set(2, "Y");
		System.out.println("Linked list after change is " + object);
		
		
		//iterate over the elements of the list
		
		//1st way: FOREACH()
		
		System.out.println("Iterate over the list with forEach() method");
		
		object.forEach(item -> {System.out.println("the current element is " + item);} );
		
		//2nd way: ITERATOR(), only traverse in forward direction.
		System.out.println("Iterate over the list with iterator() method");
		
		Iterator<String> strIterator = object.iterator();
		
		while(strIterator.hasNext())		
		{
			String item = strIterator.next();
			System.out.print(item + " ");
		}
		
		// 3rd way: ListIterator(), allows forward and backward directions
		System.out.println();
		System.out.println("Iterating over the linked list with ListIterator() method ");
		ListIterator<String> strListIterator = object.listIterator(object.size());
		
		while(strListIterator.hasPrevious())		
		{
			String item = strListIterator.previous();
			System.out.print(item + " ");
		}
	}

	private void StackTest()
	{
		Stack<String> stack = new Stack<String>();
		
		stack.push("Book 1");
		stack.push("Book 2");
		stack.push("Book 3");
		stack.push("Book 4");
		
		System.out.println("Stack is " + stack);
		
		// Remove the top element and return it 
		String bookAtTop = stack.pop();
		System.out.println("the book at the top is " + bookAtTop);
		System.out.println("After pop() the stack is " + stack);
		
		// get top element w/o deleting 
		bookAtTop = stack.peek();
		System.out.println("the book at the top is " + bookAtTop);
		System.out.println("After peek() the stack is " + stack);
		
		// is stack empty
		System.out.println("Is stack empty? " + stack.isEmpty());
		
		// find the size of stack 
		System.out.println("Size of the stack is " + stack.size());
		
		// search for an element		
		int position = stack.search("Book 3");
		if(position == -1)
			System.out.println("The element is not in the stack!");
		else 
			System.out.println("The position of 'Book 3' is " + position);
		
		position = stack.search("Book 5");
		if(position == -1)
			System.out.println("The element is not in the stack!");
		else 
			System.out.println("The position of 'Book 5' is " + position);
		
		// iterate over elements of stack
		
		//1st way: FOREACH()
		
		System.out.println("Iterate over the list with forEach() method");
		
		stack.forEach(item -> {System.out.println("the current element is " + item);} );
		
		//2nd way: ITERATOR(), only traverse in forward direction.
		System.out.println("Iterate over the list with iterator() method");
		
		Iterator<String> strIterator = stack.iterator();
		
		while(strIterator.hasNext())		
		{
			String item = strIterator.next();
			System.out.print(item + " ");
		}
		
		// 3rd way: ListIterator(), allows forward and backward directions
		System.out.println();
		System.out.println("Iterating over the linked list with ListIterator() method ");
		ListIterator<String> strListIterator = stack.listIterator(stack.size());
		
		while(strListIterator.hasPrevious())		
		{
			String item = strListIterator.previous();
			System.out.print(item + " ");
		}
		
	}
	
	private void QueueTest()
	{
		Queue<String> queue = new LinkedList<String>();
		
		// ADD elements 
		
		queue.add("Product 1");
		queue.add("Product 2");
		queue.add("Product 3");
		queue.add("Product 4");
		
		System.out.println("Queue is " + queue);
		
		System.out.println("Is 'Product 5' included successfully? " + queue.offer("Product 5"));
		
		
		// poll and remove are equivalent...
		System.out.println("Removed element " + queue.remove());
		
		System.out.println("poll() element " + queue.poll());
		
		// w/o head removal get the head 
		System.out.println("Head element " + queue.element());
		
		System.out.println("peek() element " + queue.peek());

		System.out.println("Is 'Product 5' included in the queue? " + queue.contains("Product 5"));
		
		System.out.println("Is the queue empty? " + queue.isEmpty());
	}
	
	public void ImplementAlgorithm()
	{
//		DataTypes();
//		
//		ArrayTest();
		
//		LinkedListTest();
		
//		StackTest();
		
		QueueTest();
		
	}
	

}
