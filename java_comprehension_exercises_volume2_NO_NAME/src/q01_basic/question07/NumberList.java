package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	/**
	 * 整数のList
	 * 
	 */
	private List<Integer> numbers = new ArrayList<>();

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void addFromOneTo(Integer limit) throws IOException {
		//TODO ここから実装する
		//1 引数で取得した値までnumbersに整数値を順番に追加する
		String input_str = reader.readLine();
		int input_num = Integer.parseInt(input_str);
		//引数で取得した値までのため、初期値を1にする
		for (int i = 1; i < input_num; i++) {
			//配列の0から代入するために、i - 1にする
			numbers.add(i - 1);
			i++;
		}

	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */

	//2 numbersフィールドの各値を合計して計算する
	public Integer calcSumOfList() {
		Integer sum = 0;
		//TODO ここから実装する
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}

		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	//3 numbersの各要素の値を2倍に
	public void doubleListEachValue() {
		//TODO ここから実装する
		for (int i = 0; i < numbers.size(); i++) {
			//リストの0から取り出し
			int stockdouble = numbers.get(i);
			//値を2倍にして返す
			stockdouble = stockdouble * 2;
			//リストに戻す人
			numbers.set(i, stockdouble);
		}

	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	//4 前半部分を削除
	public void removeIndexOfFirstHalf() {
		//TODO ここから実装する
		//リストの要素数をlistlengthに取得し
		int listlength = numbers.size();
		//要素数が偶数なら2で割り、奇数なら2で割った後1を足す
		if (listlength % 2 == 0) {
			listlength = listlength / 2;
		} else {
			listlength = (listlength / 2) + 1;
		}

		//listlengthだけfor文を回し、毎回先頭の要素を消していく
		for (int i = 0; i < listlength; i++) {
			numbers.remove(0);
		}

	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
