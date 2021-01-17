package lambda;

@FunctionalInterface//함수형 인터페이스(람다식 인터페이스)
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	//메서드를 두 개 이상 선언 불가능
}
