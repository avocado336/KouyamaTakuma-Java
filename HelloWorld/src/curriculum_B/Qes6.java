package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Scannerクラスに変数scを代入
		Scanner sc = new Scanner(System.in);
		// String変数nameにテキストを入力できるnextLineを代入
		String name = sc.nextLine();
		// splitを用いてstring型のgoodsという配列に『』ないを代入
		String[] goods = name.split("、");
		// Randomクラスを変数randに代入
		Random rand = new Random();

		// 拡張for文を用いてgoodsという配列をmerchanという変数に代入
		for (String merchan : goods) {
			// int型の変数scoreにrandomクラスnextInt（11文字以下)で代入
			int score = rand.nextInt(12);
			// switch文を用いて()内の条件が下記caseだった場合sysoutっで出力
			switch (merchan) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + score + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + score + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + score + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + score + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + score + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				// case文の中にテレビとディスプレイを書く
				// 条件演算子を用いてmerchanがテレビだった場合scoreをそうじゃない場合11-scoreを出力することを変数resultに代入
				int result = merchan == "テレビ" ? score : 11 - score;
				System.out.println(merchan + "の残り台数は" + result + "台です");
				break;
			// defaultを用いて上記のcase内の条件に当てはまらない場合下記の値を出力
			default:
				System.out.println("『" + merchan + "』は指定の商品ではありません");
			}

		}
		// scannerクラスで指定した変数scの終了を宣言する
		sc.close();

	}
}

