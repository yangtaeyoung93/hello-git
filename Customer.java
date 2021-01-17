package ploymophism;

public class Customer {
	
	protected int customerId;
	protected String customerNm;
	protected String custormerGd;
	int bonusPoint ;
	double bonusRatio;
	
	public Customer() {
		custormerGd = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerId, String customerNm) {
		custormerGd = "SILVER";
		bonusRatio = 0.01;
		this.customerId = customerId;
		this.customerNm = customerNm;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerNm + "님의 등급은 " +  custormerGd + "입니다.";  	
}
	public String showCustomerInfo(String customerNm, String customerGd, int bonusPoint) {
		return customerNm + "님의 등급은 " +  custormerGd + "이고, 보너스 포인트 점수는 " + bonusPoint +"점 입니다.";  	
}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}
	
	
}
