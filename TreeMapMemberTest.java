package treeMap;

public class TreeMapMemberTest {

	public static void main(String[] args) {
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100,"Lee");
		Member memberYang = new Member(300,"Yang");
		Member memberKim = new Member(200,"Kim");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberYang);
		
		
		manager.showAllMember();
	}

}
