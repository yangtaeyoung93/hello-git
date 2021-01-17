package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
			
		
		ArrayList list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i = 0; i < list.size(); i++) {
			String string = (String) list.get(i);
			
			System.out.println(string);
		}
		
		for (Object s : list) {
			System.out.println(s);
		}
	}
}
