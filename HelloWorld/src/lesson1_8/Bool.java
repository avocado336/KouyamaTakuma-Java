package lesson1_8;

public class Bool {

	public static void main(String[] args) {
//		問１）
//		以下の変数を使ってboolean型変数 result_1 に「変数 a の値は変数 b の値以上」という条件式を代入して下さい。
//		boolean型変数 result_1 をコンソールに出力して下さい。
		int a = 20; //int変数aに２０を代入する
		int b = 5; //int変数bに５を代入する
		boolean result_1 = (a > b); //boolean変数を使って(a > b)をresult_1に代入する
		System.out.println(result_1); //sysoutで出力

//		問２）
//		以下の変数を使ってboolean型変数 result_2 に「変数 c の値と変数 d の値は等しくない」という条件式を代入して下さい。
//		boolean型変数 result_2 をコンソールに出力して下さい。
		int c = 5; //intcに５を代入
		int d = 10; //intdに１０を代入
		boolean result_2 = (c != d); //boolean変数を使って(c != d)をresult_2に代入
		System.out.println(result_2); //sysoutで出力
		
//		問３）
//		以下の変数を使ってboolean型変数 result_3 に「変数 e の値は10より大きい かつ 変数 f の値は10未満」という条件式を代入して下さい。
//		boolean型変数 result_3 をコンソールに出力して下さい。
		int e = 12; //int変数eに12を代入する
		int f = 8; //int変数fに8を代入する
		boolean result_3 = (e > 10 && f < 10); //boolean変数を使って(e > 10 && f < 10)をresult_3に代入
		System.out.println(result_3); //sysoutで出力
		
//		問４）
//		以下の変数を使ってboolean型変数 result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入して下さい。
//		boolean型変数 result_4 をコンソールに出力して下さい。
		int g = 7; //int変数gに7を代入する
		boolean result_4 = (g <= 5 || g >= 10); //boolean変数を使って(g <= 5 || g >= 10)をresult_4に代入
		System.out.println(result_4); //sysoutで出力
		


	}

}
