package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		//7.1 2つのオブジェクトを生成し、Member配列に代入
		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[0] = member1;
		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members[1] = member2;

		//7.2 staticなメソッドの呼び出しにはクラス名.スタティックメソッドでOK
		MemberManager.showAllMembers(members);
	}

}
