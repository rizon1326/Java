package arrayList;

import java.util.ArrayList;

public class Arraylist {
	  
		public static void main(String[] args) 
		{ 
			int n=5;
			// Declaring the ArrayList without mentioned its size
			ArrayList<Integer> arrli = new ArrayList<>(); 

			// Appending new elements at 
			
			for (int i = 1; i <= n; i++) 
				arrli.add(i); 

			// Printing elements 
			System.out.println(arrli); 

			// Remove element at index 3 
			arrli.remove(3); 

			// Displaying the ArrayList 
			// after deletion 
			System.out.println(arrli); 

			// Printing elements one by one 
			for (int i = 0; i < arrli.size(); i++) 
				System.out.print(arrli.get(i) + " "); 
		} 
	} 


