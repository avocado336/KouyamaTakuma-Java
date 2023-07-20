package curriculum_New_1_18;

import java.util.Random;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// detaメソッドの中に出力内容を渡す
		data("Hello JavaSE",11);
		
		// int型の変数ansにkakeメソッドの結果を渡す
		int ans = kake(2,3);
		// returnで戻ってきたメソッドkakeを代入したint型変数ansをsysoutで出力
		System.out.println(ans);
		
		// int型配列変数num2に1-5の整数を代入
		int[] num2 = {1,2,3,4,5};
		// hairetuメソッドの中に変数名num2の結果を渡す
		hairetu(num2);
		
		// double型変数ans2にkakeメソッドの結果を渡す
		double ans2 = kake(2.0,3.0);
		// sysoutでkakeメソッドから渡されたdouble型変数ans2を出力
		System.out.println(ans2);
		
		// int型変数cに3を代入
		int c = 3;
		// int型配列の変数dにransuuziメソッドの結果を渡す
		int[] d = ransuuzi(c);
		
		// double型変数eにrandAveメソッドの結果を渡す
		double e = randAve(d);
		
		// kotaeメソッド内に記載したい中身（変数：e）を記載
		System.out.println(kotae(e));
		
	}
	// 上で渡されたメソッドの中の仮メソッドで指定した変数を宣言
	// Q1のメソッドを宣言
	public static void data(String name,int num) {
		// sysoutで代入した変数を用いて出力
		System.out.println(name + " " + num);
	}
	// 上で渡されたkakeメソッドの中の仮メソッドでint型変数を宣言
	public static int kake(int a,int b) {
		// return句を用いて上で宣言したint型の変数a*bの結果をmainメソッドに戻す
		return a * b;
	}
	// 上で渡されたhairetuメソッドの中の仮メソッドでint型配列変数aを宣言
	public static void hairetu(int[] a) {
		// hairetuメソッド内でfor文を用いてint型変数num3から変数aまで処理を繰り返す
		for(int num3 : a) {
			// sysoutで変数名num3を実行
			System.out.println(num3);
		}
	}
	
	// 上で渡されたkakeメソッドの仮メソッドでdouble型変数a,bを宣言
	public static double kake(double a,double b) {
		// returnを用いてkakeメソッド内の仮メソッドで宣言したdouble型変数a+bをmainメソッドに戻す
		return a + b;
	}
	
	// 上で渡されたransuuziメソッドないの仮メソッドでint型変数cを宣言
	public static int[] ransuuzi(int cc) {
		// int型配列の変数arrにint型配列cを渡す
		int[] arr = new int[cc];
		// for文を用いてint型変数iが変数cと一緒になるまで1ずつ加算する繰り返し処理
		for(int i =1; i <= cc; i++) {
			// random型の変数randにnewRandomを渡す
			Random rand = new Random();
			// int型変数scoreに1から100までのランダムに表示される処理を渡す
			int score = rand.nextInt(100) +1;
			// sysoutで1から100までの結果を（c回）出力
			System.out.println(score);
			// 変数名scoreを配列型変数arrのi(i - 1番目)に渡す
			arr[i-1] = score;
		}
		// return句を用いてint型配列の変数arrをmainメソッドに戻す
		return arr;
	}	
	
	// 上で渡されたrandAveメソッド内の仮メソッドでint型配列の変数dを宣言
	public static double randAve(int[] dd) {
		// double型変数sumに0を渡す
		double sum = 0;
		// for文を用いてint型変数iがrandAveメソッド内で宣言されたint型配列の変数dになるまで繰り返す処理
		for (int i : dd) {
			// double型変数sumにiの処理を足す
			sum += i;
		}
		// double型変数averageに変数sumをd.lengthで割った結果を渡す
		double average = sum / dd.length;
		// sysoutで変数averageを出力
		System.out.println(average);
		// return句を用いてdouble型変数averageをmainメソッドに戻す
		return average;
	}
	// 上で渡されたkotaeメソッド内の仮メソッドでdouble型変数eを宣言
	public static boolean kotae(double ee) {
		// return句を用いてeが50より大きい場合trueになる結果をmainメソッドに戻す
		return (ee >= 50);
	}
}

