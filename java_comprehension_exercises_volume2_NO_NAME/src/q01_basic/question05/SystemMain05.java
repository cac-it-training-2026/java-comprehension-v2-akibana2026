package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		//12.1 NonMemberオブジェクトを生成して配列に代入
		NonMember nonM = new NonMember("Sato Kensuke");
		members[0] = nonM;

		//12.2 Memberクラスオブジェクトを生成して値を代入
		Member men = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[1] = men;

		//12.3 各生成オブジェクトの情報を出力する
		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		nonM.buyItem();
		men.buyItem();
	}

}
