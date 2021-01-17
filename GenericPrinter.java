package generic;

public class GenericPrinter<T extends Material> {
	//T 타입에 적용이 되어 클래스가 생성될때 T 타입에 적용
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
