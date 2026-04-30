package q01_basic.question05;

public class MemberManager {

	//10 インスタンス化を禁止する
	private MemberManager() {
	}

	//11 showAllMembers
	public static void showAllMembers(AbstMember members[]) {
		for (AbstMember member : members) {
			member.showMember();
		}
	}

}
