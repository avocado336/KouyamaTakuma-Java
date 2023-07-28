package question_1_19;

import java.sql.Timestamp;

public class Animal {

	public static void main(String[] args) {
		// Dogクラスからインスタンスを生成し変数d1に入れる
		Dog d1 = new Dog();
		// sysoutで変数d1のnameを出力
		System.out.println(d1.name);
		
		// Dogクラスからインスタンスを生成しコンストラクタを呼び出す際に3を渡しそれを変数d2に入れる
		Dog d2 = new Dog(3);
		// sysoutで変数d2のnumを出力
		System.out.println(d2.num);
		
		// Timestampを用いて現在の時刻を変数timestanpに入れる
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		// sysoutで変数timestanpを出力
		System.out.println(timestamp);
		
	}
}

