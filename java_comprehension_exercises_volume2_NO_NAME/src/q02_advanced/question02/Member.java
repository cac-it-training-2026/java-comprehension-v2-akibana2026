package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {

	//7 フィールド定義
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	//8 getter setterの設定
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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
	//9 引数なしコンストラクタの定義
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */

	//10 引数ありコンストラクタの定義
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	//11
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	//12

	public void showMember() {
		System.out.println(this.toString());
		//couponの法のsysout
		System.out.println();
	}

	//13.1
	public static Member getInstance(int id, String password, String name, int age, int rank) {
		Member member1 = new Member(id, password, name, age, rank);
		//めっちゃ怪しい
		List<Coupon> coupons = new ArrayList<>();
		//13.2 13.3
		coupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		coupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));

		//13.4
		return member1;

	}

}
