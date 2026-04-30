package q02_advanced.question02;

public class MemberManager {
	//14 インスタンス化の禁止
	private MemberManager() {
	}

	//15

	public static void showAllMembers(Member members) {
		for (Member m : members) {
			showAllMembers(m);
		}
	}

	public static void updatePassword(Member members, int targetID, String password) {
		for (Member m : members) {
			targetId.equals(password);

		}

	}

}
