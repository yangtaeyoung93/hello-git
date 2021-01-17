package set;

public class HashSetMemberTest {

	public static void main(String[] args) {
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		Member memberYang = new Member(300,"Yang");
		Member memberYang2 = new Member(300,"Yang2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberYang);
		manager.addMember(memberYang2);
		
		
		manager.showMember();
	}

}
