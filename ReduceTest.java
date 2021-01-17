package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareToString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length > s2.getBytes().length) 
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"¾È³çÇÏ¼¼¿ä~~~","Hello!","Good Morning" , "¹Ý°©½À´Ï´Ù."};
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2) ->
			{if(s1.getBytes().length > s2.getBytes().length) 
				return s1;
			else return s2;
			
		}));
		
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareToString()).get());
	}
}
