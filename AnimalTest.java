package ploymophism;

import java.util.ArrayList;

//�ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ°�
//���� �ڵ忡�� ���� ���� ����� ����



class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
		
		
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �� �߷� �ݴϴ�.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}
class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ� ���� ���ϴ�.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Animal hyAnimal = new Human();
		Animal tiAnimal = new Tiger();
		Animal eaAnimal = new Eagle();
		
		
		
		/*AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hyAnimal);
		test.moveAnimal(tiAnimal);
		test.moveAnimal(eaAnimal);*/
		
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hyAnimal);
		animalList.add(tiAnimal);
		animalList.add(eaAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	
	
	
	
}
