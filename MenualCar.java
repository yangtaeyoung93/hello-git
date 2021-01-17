package template;

public class MenualCar  extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이  방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("사람이 자동차를 멈춥니다.");
		
	}

}
