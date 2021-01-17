package gameLevel;

public class SuperPlayer  extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 못 합니다..");
	}

	@Override
	public void turn() {
		System.out.println("turn는 못 합니다..");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-******초급자 레벨입니다..");
	}
	
	
}
