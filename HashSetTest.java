package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		//hashset은 중복 허용하지 않으며, 순서대로 나오지 않음
		// id, 학번 등 관리할때 사용
		HashSet<String> set = new HashSet<>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {//다음 엘리먼트가 있느냐?
			String str = ir.next();
			System.out.println(str);
		}
	}
}
