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
		return customerNm + "���� ����� " +  custormerGd + "�Դϴ�.";  	
}
	public String showCustomerInfo(String customerNm, String customerGd, int bonusPoint) {
		return customerNm + "���� ����� " +  custormerGd + "�̰�, ���ʽ� ����Ʈ ������ " + bonusPoint +"�� �Դϴ�.";  	
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
