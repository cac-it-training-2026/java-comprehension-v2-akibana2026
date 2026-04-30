package q01_basic.question03;

class Member {
	//TODO ここから実装する

	//1.フィールド定義
	private String name;
	private int age;
	private int rank;

	//2.getter setter定義
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		System.out.println("---GET RANK---");
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 
	 */
	//3.引数なしのコンストラクタ
	public Member() {
	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */

	//4.引数からname age rankを代入するコンストラクタ
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	//5.showMemberメソッドを定義
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}

}
