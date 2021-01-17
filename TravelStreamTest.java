package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelStreamTest {

	public static void main(String[] args) {
		TravelMember member1 = new TravelMember("¾ç¼ºÈÆ", 19, 10000);
		TravelMember member2 = new TravelMember("¾ç¼º±Õ", 28, 2030000);
		TravelMember member3 = new TravelMember("¾çÅÂ¿µ", 29, 2230000);
		
		
		List<TravelMember> list = new ArrayList<TravelMember>();
		
		list.add(member1);
		list.add(member2);
		list.add(member3);
		
		System.out.println(list);
		
		list.stream().map(c->c.getName()).forEach(s->System.out.print(s +" "));
		int total = list.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		list.stream().filter(c -> c.getAge() > 20).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
