package lesson1_4;

public class Curriculum_New_1_4 {

	// Q1 下記9個をクラス変数として宣言のみしてください
	//	・バイト型・短整数型・整数型・長整数型
	// 	・単精度浮動小数点数型・倍精度浮動小数点数型
	//   ・文字型・文字列型
	//	 ・ブーリアン型 
	static byte a; //staticがなぜ必要なのか確認する
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static String h;
	static boolean i;

	public static void main(String[] args) {

		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		a = 0;
		b = 0;
		c = 0;
		d = 0L;
		e = 0.0F;
		f = 0.0d;
		g = '\u0000';
		h = null;
		i = false;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		// ・短整数型                 100
		// ・整数型                	 1000
		// ・長整数型                 10000
		// ・単精度浮動小数点数型   	 9.5
		// ・倍精度浮動小数点数型		 10.5
		// ・文字型                   a
		// ・文字列型              	 ハロー
		// ・ブーリアン型          	 true
		a = 10;
		b = 100;
		c = 1000;
		d = 10000L;
		e = 9.5F;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;

		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること
		// 11110
		System.out.println(d + c + b + a);
		// 20.0
		System.out.println(e + f);
		// a ハロー true
		System.out.println(g + " " + h + " "+ i);
		// 11130.0 数字を全て足す
		System.out.println(a + b + c + d + e + f );
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(a * b * c * d);
		// 0.105                      10.5割る100をする
		System.out.println(f / b);
		// -90                        10引く100をする
		System.out.println(a - b);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

	}

}