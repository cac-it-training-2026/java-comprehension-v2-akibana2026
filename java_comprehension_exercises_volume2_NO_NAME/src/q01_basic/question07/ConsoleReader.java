package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	//5 inputNumberメソッドでコンソール上の入力値を取得し、intに変換して戻す
	public int inputNumber() throws IOException, NumberFormatException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input_str = reader.readLine();
		int input_num = Integer.parseInt(input_str);

		return input_num;
	}

}
