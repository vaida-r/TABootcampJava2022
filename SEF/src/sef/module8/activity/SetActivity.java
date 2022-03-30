package sef.module8.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.

		Set names = new TreeSet() ;
		names.add("adomas");
		names.add("bronius");
		names.add("cecilija");
		names.add("bronius");
		names.add("akvile");


		//TODO: 2 - Call print method to print the set passed as its parameter.
		print(names);
	}
	
	static void print(Set set )
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (Object obj: set){
				System.out.println(obj.toString() );
			}
	}
}
