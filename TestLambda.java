package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambda = s -> System.out.println(s);
		lambda.showString("TEST");
		showMyString(lambda);
		
		PrintString test = returnString();
		test.showString("TEST3");
	}
	
	//Ÿ���� �Ű������� �Ѿ��
	public static void showMyString(PrintString p) {
		p.showString("TEST2");
		
	}
	
	public static PrintString returnString() {
		return s-> System.out.println(s + "!!!!");
	}
}
 