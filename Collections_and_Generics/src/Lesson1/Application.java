package Lesson1;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String args[]) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("hello");
		words.add("word");
		words.add("19");
		
		String item=(String)words.get(0);
		String item2=(String)words.get(1);
		String item3=(String)words.get(2);
		
		System.out.println(item+" "+item2);
		System.out.println(item3);
		
		
		LinkedList<Integer> number=new LinkedList<Integer>();
		number.add(12);
		number.add(46);
		number.add(100);
		number.add(140);
		number.add(200);
		number.remove(2);
		number.removeFirst();
		
		for(int numbers : number) {
			System.out.println(numbers);
		}
	}
}
