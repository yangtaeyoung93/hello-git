package ploymophism;

public class GoldCustomer extends Customer {
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerNm) {
		super(customerID,customerNm);
		custormerGd = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) (price * salesRatio);
		return price;
	}
	
	
	
}
