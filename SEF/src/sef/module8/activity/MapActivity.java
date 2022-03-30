package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.MapSample;

import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map myMap = new HashMap();
			myMap.put("7", "jonas");
			myMap.put("2","petras");
			myMap.put("5", "ona");
			myMap.put("4", "maryte");
			
		
			
			//2 - Call print method to print the map passed as its parameter.
			print(myMap);
			printWithLoop(myMap);

		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();

			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("mYKeys\tValue");
			Iterator it = keySet.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key + "\t" + map.get(key));
			}


			// ????? still do not understand when the magic of key ordering happens?
		
		}

	static void printWithLoop(Map map)
		{
		//3 - Type code to print this map       //// with loop
		Set keySet = map.keySet();

		System.out.println("*************************************");
		System.out.println("mYKeys\tValue");
			for (Object k : keySet ) {
				System.out.println(k + "\t" + map.get(k));
			}

			// ????? still do not understand when the magic of key ordering happens?

	}

	}
