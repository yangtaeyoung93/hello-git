package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
//��Ʈ���� �ڷḦ �Ҹ��ϸ鼭 ������ ����
	//�������� �Ŀ� ��Ʈ���� ���̻� �ٸ� ������ ������ �� ����
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
