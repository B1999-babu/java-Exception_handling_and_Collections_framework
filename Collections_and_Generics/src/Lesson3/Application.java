package Lesson3;

import java.util.HashSet;

public class Application {
	
	public static void main(String args[]) {
		
		HashSet<String> values=new HashSet<String>();
		values.add("Hello");
		values.add("word");
		values.add("babu");
		values.add("Hello");
		values.add("tiger");
		values.add("babu");
		
		for(String value : values) {
			System.out.println(value);
		}
		
		HashSet<Animals> animal=new HashSet<Animals>(); 
		
		Animals animal1=new Animals("Tiger",12);
		Animals animal2=new Animals("Tiger",12);
		animal.add(animal2);
		animal.add(animal1);
		
		
			animal.add(new Animals("Tiger",10));
			animal.add(new Animals("Lion",5));
			animal.add(new Animals("Tiger",10));
			animal.add(new Animals("Dog",4));
			
			for(Animals value:animal) {
				System.out.println(value);
			}
			
		System.out.println(animal1.equals(animal2));
		
	}

}
