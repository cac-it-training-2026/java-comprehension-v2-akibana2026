package q01_basic.question02;

class Member {
	//TODO ここから実装する
	//name age rankフィールドを宣言
	private String name;
	private int age;

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

	private int rank;

	//showMemberメソッドを宣言し、フィールドの値を出力する
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}

	public void rankUp() {
		System.out.println(">>>RANK UP>>>");
		rank++;
	}
}
