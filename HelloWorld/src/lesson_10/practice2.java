package lesson_10;

public class practice2 {

	public static void main(String[] args) {
		/*	
		問題.for文を使用して九九の計算を出力してください。
			※出力例 	1×1=1 1×2=2…1×9=9
						2×1=2 2×2=4…2×9=18
								・
								・
								・
						9×1=9 9×2=18…9×9=81
						*/
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		// int型変数の配列に1から9までの値を代入
		for(int a = 0; a < numbers.length; a++) {
			// for文を使って1から9を繰り返しで表示
			for(int b =0; b < numbers.length; b++) {
				int ans = numbers[a] * numbers[b];
				// int型変数の配列(a)の値と配列(b)を掛ける
				System.out.println(numbers[a] + "×" + numbers[b] + "=" + ans);
				// sysoutで配列(a)と配列(b)を出力してint変数を用いて宣言したansを答えとして出力
			}
		}

	}

}
