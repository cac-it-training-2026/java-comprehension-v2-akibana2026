package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {

	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
	public String inputString() throws IOException {
		//TODO ここから実装する
		//7 コンソール上の入力値を取得して戻り値として返す
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input_str = reader.readLine();

		return input_str;
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		//8 コンソール上の入力値を数字にして返す
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input_int = reader.readLine();
		int input = Integer.parseInt(input_int);
		return input;

	}

}
