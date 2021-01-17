package generic;

public class GenericPrinter<T extends Material> {
	//T Ÿ�Կ� ������ �Ǿ� Ŭ������ �����ɶ� T Ÿ�Կ� ����
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
