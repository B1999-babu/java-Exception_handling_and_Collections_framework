package Lesson4;

import java.util.ArrayList;

public class Application {

	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(43);
		list.add(100);
		list.add(43);
		list.add(56);
		
		
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		newlist.add(10);
		newlist.add(56);
		list.addAll(newlist);
		System.out.println(list);
		
	}
}
