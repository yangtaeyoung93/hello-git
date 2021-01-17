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
		//inclass는 outclass가 생성이 된 이후에 생성이 되므로 static을 쓸 수 없음
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
		//outclass의 생성여부와 상관없이 생성
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		static void sTest() {
			//System.out.println(inNum);//클래스가 생성된 이후에 만들어져서
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
			sInclass.inTest(); // 스태틱 메서드가 아니므로 스태틱클래스를 먼저 호출해줘야 호출 가능
			OutClass.inStaticClass.sTest();
		}
}
