package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) throws NumberFormatException, IOException {

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

		//6.3
		numberList.addFromOneTo(limit);

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

	}

}
