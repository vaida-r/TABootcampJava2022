package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List listOfNames = new ArrayList();
		List<String> listOfNamesOnlyString = new ArrayList();

		listOfNames.add("vvv");
		listOfNames.add("bbbb");
		listOfNames.add(10);
		listOfNames.add(0,"pirmas");

		listOfNamesOnlyString.add("jonas kareiva");
		listOfNamesOnlyString.add("petras pirmasis");
		listOfNamesOnlyString.add(1,"second");

		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(listOfNames);
		System.out.println("------");
		print(listOfNamesOnlyString);
		
	}
	
	static void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		for  (Object obj: list){
			System.out.println(obj.toString() );
		}
	
	}
}
