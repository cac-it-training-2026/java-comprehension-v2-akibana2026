package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

class Member {

	//6 フィールド定義
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;
	//	List<Coupon> coupons = new ArrayList<>();

	//7 getter setterの定義
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

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

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * 
	 */

	//8 引数なしのコンストラクタ
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */

	//9.1代入するコンストラクタ
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

		//9.2 Couponオブジェクトの生成
		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");

		//9.3 ArrayListを生成 this.couponsとすることで、フィールドのcouponsを使用することができる
		this.coupons = new ArrayList<>();

		coupons.add(coupon1);
		coupons.add(coupon2);
		//		this.setCoupons(coupons);

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=";
	}

	public void showMember() {
		System.out.print(this.toString());
		System.out.println(getCoupons().toString());
		System.out.println("******************");

	}

}
