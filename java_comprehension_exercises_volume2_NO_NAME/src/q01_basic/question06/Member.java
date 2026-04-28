package q01_basic.question06;

public class Member extends AbstMember {
	//1 フィールド定義
	private int id;
	private String password;
	private int age;
	private int rank;

	//2 getter setter定義
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	//3 引数なしコンストラクタを定義
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */

	//4 引数ありコンストラクタを定義
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	//5 buyItemをオーバーライド
	@Override
	public void buyItem() {
		System.out.println(name + " purchased the item at a 50% off");
	}

	//6 showMemberをオーバーライド
	@Override
	public void showMember() {
		System.out.println("---SHOW MEMBER---");
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}
}
