package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	//6 showAllMembersメソッドをstaticとして定義
	//引数のMember配列を拡張forで取り出すため、
	public static void showAllMembers(Member members[]) {
		for (Member member : members) {
			member.showMember();
		}
	}

}
