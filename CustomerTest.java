package ploymophism;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerYang = new VipCustomer(10010,"���¿�",1000);
		Customer customerKim = new GoldCustomer(20010,"������");
		Customer customerLee = new Customer(30010, "�̼���");
		
		customerList.add(customerYang);
		customerList.add(customerKim);
		customerList.add(customerLee);
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("�������� ���ʽ�  ����Ʈ ����");
		
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerNm() +"���� ���ʽ� ������ " + customer.bonusPoint + "�� �̸� , �������� " + customer.bonusRatio + "�Դϴ�." );
			System.out.println(customer.getCustomerNm() +"���� ������ �ݾ��� " + cost + "�� �Դϴ�.");
		} 
		
		
	}
}
