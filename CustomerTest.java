package ploymophism;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerYang = new VipCustomer(10010,"양태영",1000);
		Customer customerKim = new GoldCustomer(20010,"김유신");
		Customer customerLee = new Customer(30010, "이순신");
		
		customerList.add(customerYang);
		customerList.add(customerKim);
		customerList.add(customerLee);
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("할인율과 보너스  포인트 점수");
		
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerNm() +"님의 보너스 점수는 " + customer.bonusPoint + "점 이며 , 적립율은 " + customer.bonusRatio + "입니다." );
			System.out.println(customer.getCustomerNm() +"님이 지불한 금액은 " + cost + "원 입니다.");
		} 
		
		
	}
}
