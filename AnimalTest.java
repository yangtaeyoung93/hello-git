package ploymophism;

import java.util.ArrayList;

//하나의 코드가 여러 자료형으로 구현되어 실행되는것
//같은 코드에서 여러 실행 결과가 나옴



class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
		
		
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두 발로 뜁니다.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 내 발로 뜁니다.");
	}
}
class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘 높이 납니다.");
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
