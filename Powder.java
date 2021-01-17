package generic;

public class Powder extends Material{
	public String toString() {
		
		return "재료는 파우더입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우터프린터로 프린트합니다.");
	}
}
