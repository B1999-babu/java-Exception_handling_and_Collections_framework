package Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String args[]) {
	
	ArrayList<String> animals=new ArrayList<String>();
	animals.add("Lion");
	animals.add("Cat");
	animals.add("Elephant");
	animals.add("Dog");
	
	for(int i=0; i<animals.size(); i++) {
	 System.out.println(animals.get(i));	
	}

	for(String value : animals) {
		System.out.println(value);
	}
	
	
	ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
	Vehicle vehicle2=new Vehicle("Maruti","Suzuki",14000,false);
	
	vehicles.add(new Vehicle("Honda","city",12000,false));
	vehicles.add(vehicle2);
	vehicles.add(new Vehicle("Jeep","Wranger",25000,true));
	
	for(Vehicle car : vehicles) {
		System.out.println(car);
		
	}
	printElements(vehicles);
	printElements(animals);
}
	public static void printElements(List someList) {
	for(int i=0; i<someList.size(); i++) {
		System.out.println(someList.get(i));
	}
	}
}
