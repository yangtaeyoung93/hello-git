package generic;

public class Plastic  extends Material{
	public String toString() {
		
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱프린터로 프린트합니다.");
		
	}
}
