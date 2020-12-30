package Lab6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
	
	public class Point
	{
		double x;
		double y;
		
		public void printCoordinates()
		{
			System.out.println("the coordinates of the point are (" + x + ", " + y + ")");
		}
		
		public void updateCoordinates()
		{
			x = 2 * x;
			y = 3 * y;
			System.out.println("the updated coordinates of the point are (" + x + ", " + y + ")");
		}
	};
	
	private void DataTypes()
	{
		// data types
		
				boolean boolVar = true;
				char character = 'a'; // '5', '!'
				String myString = "'Hello world!'";
				byte byteVar = 4;
				short shortVar = 10;
				int intVar = 100;
				long longVar = 10000;
				float floatVar = (float)10.34;
				double doubleVar = 100.56;
				
				Point myPoint = new Point();
				myPoint.x = 3.5;
				myPoint.y = 5.8;
				
				myPoint.printCoordinates();
				myPoint.updateCoordinates();
				
				System.out.println();
				System.out.println("the coordinates of the point are (" + myPoint.x + ", " + myPoint.y + ")");
				System.out.println();
				System.out.println("My string is " + myString);
				
				//String.format("%.2f", x)
				
				System.out.println(boolVar);
				
				System.out.println(character);
				
				byteVar = 0;
				for(int i = 0; i < 300; i++)
				{
					System.out.print((byteVar < 0 ? 256 + byteVar : byteVar) + " ");
					byteVar++;
				}
				
				System.out.println();
				System.out.println("short numbers ");
				
				shortVar = 0;
				for(int i = 0; i < 6622; i++)
				{
					//System.out.print(i + " ");
					System.out.print(shortVar + " ");
					//System.out.print((shortVar < 0 ? 65536 + shortVar : shortVar) + " ");
					shortVar++;
				}
				
				System.out.println();
				System.out.println("int numbers ");
				//System.out.print(shortVar);
				
				//System.out.println(intVar);
				
				System.out.println();
				
				for(int i = 0; i < 6622; i++)
				{
					System.out.print(i + " ");
				}
				
				
				System.out.println(longVar);

				System.out.println(floatVar);
				
				System.out.println(doubleVar);
	}
	
	private void ArrayTest()
	{
		int[] intArray = new int[3];
		double[] doubleArray = new double[14];
		
		// the size of the array cannot change in the runtime of the code. 
		
		intArray[0] = 4;
		intArray[1] = 3;
		intArray[2] = 8;
		
		for(int i = 0; i < intArray.length; i++)
			System.out.println("the " + i + "th element of the array is " + intArray[i]);
	}
	
	private void LinkedListTest()
	{

		LinkedList<String> object = new LinkedList<String>(); 
		
		 // Adding elements to the linked list 
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object); 
  
        // Removing elements from the linked list 
        object.remove("B"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        // Finding elements in the linked list 
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
        // Number of elements in the linked list 
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Y"); 
        System.out.println("Linked list after change : " + object); 
        
        
        //iterating over the elements of the list

        System.out.println("Iterating over the list with forEach() method of list ");
        object.forEach(item -> {
        	System.out.print(item + " ");
        });
        
        System.out.println();
        System.out.println("Iterating over the list with iterator() method of list ");
        // only traverse in forward direction.
        Iterator<String> strIterator = object.iterator();
        while(strIterator.hasNext())
        {
        	String item = strIterator.next();
        	System.out.print(item + " ");
        }
       
        System.out.println();
        System.out.println("Iterating over the list with listIterator() method of list");
        // ListIterator allows to traverse both in forward and backward directions.
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
		 
		 // Pushing (adding) element on the top of the stack 
		 stack.push("Book 1");
		 stack.push("Book 2");
		 stack.push("Book 3");
		 stack.push("Book 4");
		 
		 System.out.println("Stack is " + stack);
		 
		 // Popping (removing) element from the top of the stack 
		 try {
			 String bookAtTop = stack.pop();  //Throws EmptyStackException is the stack is empty.
			 System.out.println("Stack.pop() is " + bookAtTop);
			 System.out.println("Stack after pop() is " + stack);
			 System.out.println();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		// Displaying (w/o deletion) element on the top of the stack 		 
		 String bookAtTop = stack.peek();
		 System.out.println("Stack.peek() is " + bookAtTop);
		 System.out.println("Stack after peek() is " + stack);
		 
		 // check if the stack is empty
		 System.out.println("Is stack empty?  " + stack.isEmpty());
		 
		 // find the size of the stack
		 System.out.println("Size of the stack is " + stack.size());
		 
		 // search for an element 
		 // the search() method of stack returns 1-based position from the top of the stack, or -1 if the element is not in the stack.
	
		 int position = stack.search("Book 3");
		 if(position == -1)
			 System.out.println("The element is not in the stack!");
		 else 
			 System.out.println("The element \"Book 3\" is at position: " + position);
		 
		 position = stack.search("Book 5");
		 if(position == -1)
			 System.out.println("The element is not in the stack!");
		 else 
			 System.out.println("The element \"Book 5\" is at position: " + position);
		 
        //iterating over the elements of the list

        System.out.println("Iterating over the list with forEach() method of list ");
        stack.forEach(item -> {
        	System.out.print(item + " ");
        });
        
        System.out.println();
        System.out.println("Iterating over the list with iterator() method of list ");
        // only traverse in forward direction.
        Iterator<String> strIterator = stack.iterator();
        while(strIterator.hasNext())
        {
        	String item = strIterator.next();
        	System.out.print(item + " ");
        }
       
        System.out.println();
        System.out.println("Iterating over the list with listIterator() method of list");
        // ListIterator allows to traverse both in forward and backward directions.
        ListIterator<String> strListIterator = stack.listIterator(stack.size());
        while(strListIterator.hasPrevious())
        {
        	String item = strListIterator.previous();
        	System.out.print(item + " ");
        }
	 
		 
	}
	
	private void QueueTest()
	{
		//We cannot create instance of a Queue since it is an interface, thus we
		Queue<String> queue = new LinkedList<String>();
		
		//Adding elements to the Queue
		queue.add("Product 1");
		queue.add("Product 2");
		queue.add("Product 3");
		
		// add elements to the queue using offer() - returns true/false 
		System.out.println("\"Product 4\" inserted successfully? " + queue.offer("Product 4"));
		System.out.println("\"Product 5\" inserted successfully? " + queue.offer("Product 5"));
		
		System.out.println("Elements in Queue:"+ queue);
		
		//We can remove an element from Queue using remove() method, this removes the first element from the Queue
		System.out.println("Removed element: "+ queue.remove());
		
		//element() method - this returns the head of the Queue.
		System.out.println("Head: "+ queue.element());
		
		//poll() method - this removes and returns the head of the Queue. Returns null if the Queue is empty
		System.out.println("poll(): "+ queue.poll());
		
		//peek() method - it works same as element() method, however, it returns null if the Queue is empty
		System.out.println("peek(): "+ queue.peek());
		
		//Displaying the elements of Queue
		System.out.println("Elements in Queue:"+ queue);
		
		//check an element in the queue
		System.out.println("Does the queue contain \"Product 1\"? "+ queue.contains("Product 1"));
		System.out.println("Does the queue contain \"Product 4\"? "+ queue.contains("Product 4"));
		
		// check the queue is empty
		System.out.println("Is the queue empty? "+ queue.isEmpty());
	}
	
	public void ImplementAlgorithm()
	{		
		DataTypes();

		// data structures
		
		ArrayTest();
		 
		LinkedListTest();
		
		StackTest();
		
		QueueTest();
		
		
	}

}
