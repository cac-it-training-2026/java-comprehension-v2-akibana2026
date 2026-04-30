package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		//6.1 引数なしのコンストラクタを使用するnullmemberを生成
		Member nullmember = new Member();
		//6.2 引数ありのmiuraオブジェクトを生成
		Member miura = new Member("Miura Manabu", 28, 2);

		//6.3各生成オブジェクトのshowMemberメソッドを呼び出し
		nullmember.showMember();
		miura.showMember();
	}
}
