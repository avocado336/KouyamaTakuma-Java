// Q1：フィールドに動物の名前の変数を定義してください。
	
// Q2：フィールドに動物の数の変数を定義してください。
	
// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

package question_1_19;

public class Dog{
	// String型変数をフィールドとして宣言
	protected String name;
	// int型変数をフィールドとして宣言
	protected int num;
	
	// Dogクラスをコンストラクタとして定義
	public Dog() {
		// フィールドを犬で初期化
		this.name = "犬";
	}
	
	// Dogクラス（）内で引数として整数を1つ受け取る
	public Dog(int num) {
		// 引数の値でフィールドを初期化
		this.num = num;
	}
}