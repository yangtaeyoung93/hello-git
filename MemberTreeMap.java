package treeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import treeMap.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	
	public MemberTreeMap() {
		treeMap = new TreeMap<>();
		
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	
	public boolean removeTreeMap (int  memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			
			System.out.println(member);
			
		}
		
		System.out.println();
	}
}
