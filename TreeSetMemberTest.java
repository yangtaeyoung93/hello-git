package treeSEt;

public class TreeSetMemberTest {

	public static void main(String[] args) {
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberYang = new Member(300,"Yang");
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberYang);
		
		
		manager.showMember();
	}

}
