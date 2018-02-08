package week_3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(12);
		myList.add(33);
		myList.add(25);
		myList.add(58);
		
		System.out.println("Print the list.");
		System.out.println(myList);
		System.out.println("-----------------------------------");
		
		System.out.println("Iterate the list.");
		for(Integer element : myList)
		{
			System.out.println(element);
		}
		System.out.println("-----------------------------------");
		
		System.out.println("Insert element to the list.");
		myList.add(0, 0);
		myList.add(5, 10);
		System.out.println(myList);
		System.out.println("-----------------------------------");
		
		System.out.println("Retrieve an element.");
		Integer x = myList.get(0);
		System.out.println("First element is: " + x);
		Integer y = myList.get(4);
		System.out.println("Fifth element is: " + y);
		System.out.println("-----------------------------------");
		
		System.out.println("Update specific array element.");
		myList.set(2, 3333);
		System.out.println(myList);
		System.out.println("-----------------------------------");
		
		System.out.println("Remove element.");
		myList.remove(2);
		System.out.println("After removing the third element, the list is now: \n" + myList);
		System.out.println("-----------------------------------");
		
		System.out.println("Sort the list.");
		System.out.println("Before sorting: " + myList);
		Collections.sort(myList);
		System.out.println("After sorting: " + myList);
		System.out.println("-----------------------------------");
		
		System.out.println("Shuffle the list.");
		System.out.println("List before shuffling:" + myList);  
		Collections.shuffle(myList);
		System.out.println("List after shuffling:" + myList); 
		System.out.println("-----------------------------------");
		
		System.out.println("Reverse the list.");
		System.out.println("List before reversing:" + myList);  
		Collections.reverse(myList);
		System.out.println("List after reversing:" + myList);
	
		
		
	}

}
