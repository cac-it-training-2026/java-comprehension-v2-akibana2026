package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	//name age rankフィールドを宣言
	String name;
	int age;
	int rank;

	//showMemberメソッドを宣言し、フィールドの値を出力する
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}
}
