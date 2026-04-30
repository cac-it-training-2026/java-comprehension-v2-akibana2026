package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) throws IOException {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		//6.1 
		ConsoleReader cons = new ConsoleReader();
		//6.2.1 6.2.2
		try {
			limit = cons.inputNumber();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

		//6.3 リストに値を入れる
		numberList.addFromOneTo(limit);
		//6.4 numbersフィールドの値を取得する
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する
		//6.5 calcメソッドで合計値を取得し、sumに代入
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する
		//6.6 numbersフィールドの値を2倍にして出力
		//6.7
		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する
		//6.8 numbersフィールドの前半部分を削除
		//6.9 numbersフィールドを出力
		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());

	}

}
