package q02_advanced.question02;

public class Coupon {

	//1 フィールドの定義
	private int id;
	private double discountRate;
	private String descripstion;

	//2 getter setterの定義
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDescripstion() {
		return descripstion;
	}

	public void setDescripstion(String descripstion) {
		this.descripstion = descripstion;
	}

	/**
	 * 
	 */
	//3 引数なしコンストラクタの定義
	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param descripstion
	 */
	//4引数ありのコンストラクタを定義し、値を代入する
	public Coupon(int id, double discountRate, String descripstion) {
		this.id = id;
		this.discountRate = discountRate;
		this.descripstion = descripstion;
	}

	//5 toStringのオーバーライド
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", descripstion=" + descripstion + "]";
	}

	//6 getInstance途中
	public static Coupon getInstance(int id, double discountRate, String description) {
		Coupon coupon = new Coupon(id, discountRate, description);
		//6.2 生成物を戻り値として返す
		return coupon;
	}

}
