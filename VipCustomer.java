package ploymophism;

public class VipCustomer extends Customer {
	
	double salesRatio;
	private int agentId;
	
	public VipCustomer(int customerId, String customerNm, int agentId ) {
		super(customerId,customerNm );
		custormerGd = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.2;
		this.agentId = agentId;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) (price * salesRatio);
		return price;
	}
	
	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + "담당 상담호 번호는 :" + agentId;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	
	
}
