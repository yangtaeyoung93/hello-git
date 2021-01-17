package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
//스트림의 자료를 소모하면서 연산을 수행
	//최종연산 후에 스트림은 더이상 다른 연산을 적용할 수 없음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> sList = new ArrayList<String>();
			
			sList.add("YangGray");
			sList.add("TaeYoung2");
			sList.add("SungKyun");
			
			Stream<String> stream = sList.stream();
			
			stream.forEach(s->System.out.print(s + " "));
			System.out.println();
			
			sList.parallelStream().sorted().forEach(s-> System.out.print(s + " "));
			System.out.println();
			sList.stream().map(s->s.length()).forEach(n->System.out.print(n));
			
	}

}
