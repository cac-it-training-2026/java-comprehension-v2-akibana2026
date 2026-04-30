package q02_advanced.question01;

class Coupon {

	//1 フィールド定義
	private int id;
	private double discountRate;
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	 * @param description
	 */

	//4 値を代入する
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

}
