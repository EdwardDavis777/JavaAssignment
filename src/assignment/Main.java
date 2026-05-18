package assignment;
import java.util.ArrayList;


public class Main
{
	/*
	 * Populates the passed array list until the passed wished size
	 * is reached.
	 * 
	 * @param List the array list you wish to populate.
	 * @param wishedSize the amount of elements you wish to add to the 
	 * passed array list.
	*/
	static void populateList(ArrayList<Integer> List,int wishedSize)
	{
		for(int i = 0; i < wishedSize; i++)
		{
		   List.add(i);	
		}
	}
	
	
	/*
	 * Populates the passed array until the fixed size is reached. 
	 * 
	 * @param arr the array you wish to populate.
	 * @param FIXED_SIZE the fixed size of the passed array.
	*/
	static void populateStandard(int arr[],final int FIXED_SIZE)
	{
		for(int i = 0; i < FIXED_SIZE; i++)
		{
			arr[i] = i;
		}
	}
	
	
	/*
	 * Parses an array list and prints all of its elements
	 * to the screen. 
	 * 
	 * @param List the array list you wish to parse and
	 * print.
	*/
	static void parseAndPrintList(ArrayList<Integer> List)
	{
		if(List.isEmpty()) return;
		for(int i = 0; i < List.size(); i ++)
		{
		   System.out.println("Element from list" + List.get(i));	
		}
	}
	
	/*
	 * Parses the passed array of type int, and prints all elements
	 * to the console.
	 * 
	 *  @param arr the array you wish to parse and print.
	 *  @param FIXED_SIZE the size of the passed array.
	*/
	static void parseAndPrintStandard(int[] arr,final int FIXED_SIZE)
	{
		for(int i = 0; i < FIXED_SIZE; i++)
		{
			System.out.println("Element from fixed" + arr[i]);
			
		}
	}
	
	static public void main(String[] args)
	{
		
		/*
		 *  Initalizing standard array.
		*/
	    final int SET_SIZE = 5;
		int c_array[] = new int[SET_SIZE];
		
		/*
		 *  Initalizing array-list.
		*/
		ArrayList<Integer> list_array = new ArrayList<Integer>();
		
		
		/*
		 * Populating all arrays. 
		*/
		populateStandard(c_array,SET_SIZE);
		populateList(list_array,10);
		
		/*
		 * Printing and parsing all arrays. 
		*/
		parseAndPrintStandard(c_array,SET_SIZE);
		parseAndPrintList(list_array);
	}
}