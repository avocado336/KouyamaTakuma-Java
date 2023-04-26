package lesson1_9;

import java.util.Random;

public class ConditionalExpression {

	public static void main(String[] args) {
//		問１）
//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。
		boolean rain = true; //boolean変数rainにtrue or falseを代入
		if(rain == true) {
			System.out.println("DVDを見ます。"); //if文を使ってもしrain変数がtrueの場合DVDを見ますとsysoutで出力
		} else {
			System.out.println("外で遊びます"); //else文を使ってrain変数がそうでない場合sysoutで外で遊びますと出力
		}

//		問２）
//		String型変数 name に任意の名前を入れて下さい。
//		int型変数 score に「0~100」までの乱数を代入して下さい。
//		もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
//		もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、
//		もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、
//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。
		String name = "john"; //String変数nameにJohnを代入
		Random rand = new Random(); //Random変数randを宣言
		int score = rand.nextInt(101); //int型変数scoreに0-100までの乱数を代入
		if(score <= 40) {
			System.out.println(name + "さんは" + score + "点です。もう少し頑張りましょう。");
			//if文を使ってスコアが40点以下であればsysoutでjohnさんは40点以下です。もう少し頑張りましょうと出力
		}else if(score >= 40 && score <= 60) {
			System.out.println(name + "さんは" + score + "点です。もう少しでした。");
			//if文を使ってスコアが40点以上60点以下ならsysoutでjohnさんは〇〇点ですもうすこしでしたと出力
		}else if(score >= 60 && score <= 80) {
			System.out.println(name + "さんは" + score + "点です。よくできました。");
			//if文を使ってスコアが60点以上80点以下ならsysoutでjohnさんは〇〇点ですよくできましたと出力
		}else if(score >= 80) {
			System.out.println(name + "さんは" + score + "点です。たいへんよくできました。");
			//if文を使ってスコアが80点以上ならsysoutでjohnさんは〇〇点ですたいへんよくできましたと出力
		}
	
//		問３）
//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
//		②変数 study を定義し、文字列 "カリキュラム" を代入する。
//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。
//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。
		int isTired = 0; //int型変数isTiredに0を代入
		String study = "カリキュラム"; //String型変数studyにカリキュラムを代入
		if(isTired == 0) {
			System.out.println("私はとても元気です。");
			//if文を使用しもしisTiredが0の場合sysoutで私はとても元気ですと出力
		} else {
			System.out.println("私は疲れています。");
			//else文で使用しそれ以外の場合はsysoutで私は疲れていますと出力
		}
		System.out.println(isTired == 0 ? "カリキュラムを続けます。" : "");
		//三項演算子をつかってif文で代入したisTiredが0の場合カリキュラムを続けますという内容をsysoutを使って出力
	}

}
