package gameLevel;

public class BeginerPlayer  extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("jump�� �� �մϴ�..");
	}

	@Override
	public void turn() {
		System.out.println("turn�� �� �մϴ�..");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-******�ʱ��� �����Դϴ�..");
	}
	
	
}
