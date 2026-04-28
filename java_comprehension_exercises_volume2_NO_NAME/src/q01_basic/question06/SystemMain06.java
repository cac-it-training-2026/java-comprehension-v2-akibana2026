package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		//9.1.1 会員IDの入力を促す
		//9.1.2.1 例外処理対応
		try {
			System.out.print("input id>>");
			inputId = cr.inputNumber();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}
		//9.1.2 パスワードの入力を促す
		try {
			System.out.print("input password>>");
			inputPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}

		//9.2 入力値をもとにinputId inputPasswordなど各値を代入
		Member member = new Member(inputId, inputPassword, name, age, rank);

		member.showMember();
	}

}
