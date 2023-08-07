// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

package question_1_19;

import java.sql.Timestamp;

public class Animal {

	public static void main(String[] args) {
		// Dogクラスからインスタンスを生成し変数に入れる
		Dog d1 = new Dog();
		// sysoutで変数を出力
		System.out.println(d1.name);
		
		// Dogクラスからインスタンスを生成しコンストラクタを呼び出す際に3を渡しそれを変数に入れる
		Dog d2 = new Dog(3);
		// sysoutで変数を出力
		System.out.println(d2.num);
		
		// Timestampを用いて現在の時刻を変数に入れる
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		// sysoutで変数を出力
		System.out.println(timestamp);
		
	}
}