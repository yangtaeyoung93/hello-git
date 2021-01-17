package innerClass;

class Outer{
 	
	int outNum = 100;
	static int sNum  = 200;
  Runnable getRunnable(int i) {
	  
	  int num = 100;
	  class MyRunnable implements Runnable{
//유효성이 짧아서 변수들이 상수가 되어 바꿀 수 없음
		@Override
		public void run() {
			System.out.println(num);
			System.out.println(i);
			System.out.println(outNum);
			System.out.println(Outer.sNum);
		}
		  
		  
	  }
	  return new MyRunnable(); // 지역내부 클래스
  }
}

public class LocalInnerClassTest {
	
	public static void main(String[] args) {
		Outer outer  = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}
}
