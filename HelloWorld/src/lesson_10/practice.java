package lesson_10;

public class practice {

	public static void main(String[] args) {
		/*
		問題.for文を使用し、以下のプログラムを作成してください。
			①変数iに1を代入
			②変数iに2ずつ足す処理を10回繰り返す。
				出力結果：  3
							5
							7
							9
							・
							・
							・
							21
							*/
		int i = 1; // int変数iに1を代入
		for(i = 3; i < 22; i += 2) {
			System.out.println(i);
			// for文を使い3から22未満までの数字に2ずつ加算していく処理をしその後sysoutでint変数iを出力する
		}

	}

}
