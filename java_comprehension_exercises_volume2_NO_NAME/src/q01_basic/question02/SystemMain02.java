package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member1 = new Member();
		//		Member member2 = new Member();

		//3.2生成したオブジェクトの3つのフィールドに値を入れる
		member1.setName("Miura Manabu");
		member1.setAge(24);
		member1.setRank(1);

		//Member2オブジェクトのフィールドにも値を入れる
		//		member2.setName("Sato Kensuke");
		//		member2.setAge(36);
		//		member2.setRank(2);

		//3.3生成したオブジェクトのshowMemberメソッドを呼び出す
		member1.showMember();
		member1.rankUp();
		int rank = member1.getRank();

		System.out.println("newRank:" + rank);

		//		member2.showMember();
		//		member2.RankUp();

	}
}
