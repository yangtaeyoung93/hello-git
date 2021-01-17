package treeSEt;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> TreeSet;
	
	public MemberTreeSet() {
		TreeSet = new TreeSet<Member>(new Member());//compareator은 디폴트 생성자를 꼭 써야함
	}
	
	public void addMember(Member member) {
		//member를 어떻게 비교해야할지를 모름
		
		TreeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = TreeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				TreeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"번호가 존재하지 않습니다.");
		return false;
	}
	public void showMember() {
		
		for (Member member : TreeSet) {
			
			System.out.println(member);
		}
		
		System.out.println();
	}
}
