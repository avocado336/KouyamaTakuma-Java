package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {

		// Scannerで初期化
		Scanner sc = new Scanner(System.in);
		// String型を用いてnameを変数として宣言
		String name = "";

		// String型の配列グー、チョキ、パーをjankenという変数に代入
		String[] janken = { "「グー」", "「チョキ」", "「パー」" };

		// Random関数、rumに代入
		Random rum = new Random();

		// boolean関数でwinという変数にtrueを代入
		boolean win = true;

		boolean fin = true;

		// int型counに１を代入
		int coun = 1;

		// findメソッドを用いて一致すればsysoutで()内のテキストを表示
		// if文の中にlengthを使い文字数のカウント
		while (fin) {
			// 文字列の入力の受け取り
			name = sc.nextLine();
			// Patternクラスで()内の正規表現をパターン化する
			Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
			// MatcherクラスでPatternクラスで宣言したpと文字列がマッチするか確認
			Matcher m = p.matcher(name);

			if (name.length() >= 10) {
				// sysoutで文字数が10文字以上の際本コメントを出力
				System.out.println("名前を10文字以内にしてください");
				// elseif文の中にlengthとisEmpty(null)の条件を指定
			} else if (name.isEmpty() || Objects.isNull(name)) {
				// sysoutで文字数が0文字またはnullの場合本コメントを出力
				System.out.println("名前を入力してください");
				// else文でそれ以外の際
			} else if (!m.matches()) {
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				// while文で指定したfinという条件がfalseとする
				fin = false;
				// sysoutでそれ以外の文字を入力した際に本コメントを出力
				System.out.println("ユーザー名「" + name + "」を登録しました");
			}
		}

		// do while関数を用いる
		do {
			// 自分の手
			int myHand = sc.nextInt();

			// 相手の手
			int enemyHand = rum.nextInt(3);

			// sysoutで下記の文字列を出力
			System.out.println("name" + "の手は" + janken[myHand]);
			System.out.println("相手の手は" + janken[enemyHand]);
			System.out.println();

			// if文を用いてじゃんけんに勝った時の処理を下記に記載
			if ((myHand == 0 && enemyHand == 1) || (myHand == 1 && enemyHand == 2) || (myHand == 2 && enemyHand == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println();
				System.out.println("勝つまでにかかった合計回数は" + coun + "回です");
				win = false;

				// elseif文で自分がチョキで相手がグーだった場合の処理を下記に記載
			} else if (myHand == 1 && enemyHand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");

				// elseif文で自分がパーで相手がチョキだった場合の処理を下記に記載
			} else if (myHand == 2 && enemyHand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");

				// elseif文で自分がグーで相手がパーだった場合の処理を下記に記載
			} else if (myHand == 0 && enemyHand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください");
				System.out.println("そしたら何かが見えてくるはずです");

				// elseif文であいこだった場合の処理を下記に記載
			} else if (myHand == enemyHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
			// int型変数counに１を加えていく処理
			coun++;
			
		// while文の中の条件で勝った場合（win）の時に処理を終了する	
		} while (win);
		// scannerクラスで指定した変数scの終了を宣言する
		sc.close();

	}

}

