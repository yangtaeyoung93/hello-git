package innerClass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inclass;
	
	public OutClass() {
		inclass = new InClass();
	}
	class InClass {
		int iNum = 100;
		//inclass�� outclass�� ������ �� ���Ŀ� ������ �ǹǷ� static�� �� �� ����
		//static int sInNum = 200;  
		
		 void inTest() {
			 System.out.println(num);
			 System.out.println(sNum);
		 }
	}
	public void usingInner() {
		inclass.inTest();
	}
	
	static class inStaticClass {
		//outclass�� �������ο� ������� ����
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		static void sTest() {
			//System.out.println(inNum);//Ŭ������ ������ ���Ŀ� ���������
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

		public static void main(String[] args) {
			OutClass outClass = new OutClass();
			outClass.usingInner();
			
			OutClass.InClass myInclass = outClass.new InClass();
			myInclass.inTest();
			
			System.out.println();
			OutClass.inStaticClass sInclass = new OutClass.inStaticClass();
			sInclass.inTest(); // ����ƽ �޼��尡 �ƴϹǷ� ����ƽŬ������ ���� ȣ������� ȣ�� ����
			OutClass.inStaticClass.sTest();
		}
}
