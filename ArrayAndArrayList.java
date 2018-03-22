package week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayAndArrayList {

	public static void main(String[] args) {
//		Array is static. Its length is fixed
//		ArrayList is dynamic. It is resizable.
		int arr[] = new int[3];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
//		We cannot add more elements to arr[]
		
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);
		arrL.add(3);
		arrL.add(5);
		arrL.add(7);
		arrL.add(9);
		
		System.out.println("print array");
		System.out.println(Arrays.toString(arr));
		System.out.println("print array size");
		System.out.println(arr.length);
		System.out.println("print arraylist");
		System.out.println(arrL);
		System.out.println("print arraylist length");
		System.out.println(arrL.size());
			
//		Array can contain both primitive data types(like int, float, double) and objects.
//		ArrayList cannot contain primitive data types, it can only contain objects.
		float[] array = new float[4];	//allowed
		ArrayAndArrayList[] array1 = new ArrayAndArrayList[4];	//allowed
		
		ArrayList<String> arrL1 = new ArrayList<>();	  //allowed
		ArrayList<Object> arrL2 = new ArrayList<>();	  //allowed
//		ArrayList<char> arrL3 = new ArrayList<char>();    //not allowed
		
//		Array can be interated by for loop
//		ArrayList has its own iterator
		System.out.println("\niterate array using for loop");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("\niterate arraylist using iterator");
		Iterator<Integer> iter = arrL.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
//		compare the time to create a new array with the new size
//		with resizing an arraylist by adding more element to it
		long t0 = System.nanoTime();
		
		int testArray[] = new int[2];
		testArray[0] = 1;
		testArray[1] = 2;
		
		int testArray1[] = new int[3];
		testArray1[0] = 1;
		testArray1[1] = 2;
		testArray1[2] = 3;
		
		long t1 = System.nanoTime();
		
		ArrayList<Integer> testArrL = new ArrayList<Integer>(2);
		testArrL.add(1);
		testArrL.add(2);
		testArrL.add(3);
		
		long t2 = System.nanoTime();
		
		System.out.println("\ntime to copy the old Array and create a new one: " + (t1 - t0));
		System.out.println("time to resize an ArrayList: " + (t2 - t1));
		
//		compare the time to get an element in array
//		with in arraylist
		long t3 = System.nanoTime();
		System.out.println("\n" + testArray[1]);
		long t4 = System.nanoTime();
		System.out.println("time to get an element from array: " + (t4-t3));
		
		long t5 = System.nanoTime();
		System.out.println("\n" + testArrL.get(2));
		long t6 = System.nanoTime();
		System.out.println("time to get an element from arraylist: " + (t6-t5));
	}

}
