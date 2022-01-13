package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application1 {
	
	public static void main(String args[]) {
		HashSet<String> hash=new HashSet<String>();
		hash.add("babu");
		hash.add("kaveri");
		hash.add("yashoda");
		hash.add("hello");
		hash.add("how");
		
//		ArrayList<String> array=new ArrayList<String>(hash);
//		Collections.sort(array);
//		System.out.println(array);
		
		
		HashSet<Employee> employee=new HashSet<Employee>();
		employee.add(new Employee("Irappa",50000,"HR"));
		employee.add(new Employee("Babu",10000,"Tech"));
		employee.add(new Employee("Durgesh",30000,"admin"));
		employee.add(new Employee("kaveri",20000,"emp"));
		
		
		ArrayList<Employee> array1=new ArrayList<Employee>(employee);
		Collections.sort(array1);
		System.out.println(array1);
		
		
	}

}
