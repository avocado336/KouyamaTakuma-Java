package curriculum_B;

import java.text.DecimalFormat;
import java.text.Format;

public class Qes5 {

	public static void main(String[] args) {
		// DecimalFormatで3桁で指定し変数fに代入
		Format f = new DecimalFormat("000");
		// int型配列numbersに1～20を代入
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		// 九九の計算
		// for文を用いてint型bが変数numbers.lengthといれ1ずつ加算していく処理
		for (int b = 0; b < 9; b++) {
			// for文を用いてint型aが変数numbers.lengthといれ1ずつ加算していく処理
			for (int a = 0; a < numbers.length; a++) {
				// int型変数ansにnumbers[a]とnumbers[b]を乗算した値を代入
				int ans = numbers[a] * numbers[b];
				// if文を用いて変数aが0より大きくなった場合下記の出力をする
				if (a <= 0) {
					System.out.print(f.format(numbers[a]) + " " + "*" + " " + f.format(numbers[b]) + " " + "=" + " "
							+ f.format(ans) + " ");
				// それ以外の場合は下記の条件を出力
				} else {
					System.out.print("||" + f.format(numbers[a]) + " " + "*" + " " + f.format(numbers[b]) + " " + "="
							+ " " + f.format(ans) + " ");
				}
			}
			// 改行
			System.out.println("");
		}

	}

}
