package innerClass;

class Outer2{
 	
	int outNum = 100;
	static int sNum  = 200;
  Runnable getRunnable(int i) {
	  
	  int num = 100;
	  return new  Runnable(){
//유효성이 짧아서 변수들이 상수가 되어 바꿀 수 없음
		@Override
		public void run() {
			System.out.println(num);
			System.out.println(i);
			System.out.println(outNum);
			System.out.println(Outer.sNum);
		}
		  
		  
	  };
  }


Runnable runner = new Runnable() {
	
		@Override
		public void run() {
				System.out.println("test");
		}
	};
}
public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {
		Outer2 outer  = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}
}
