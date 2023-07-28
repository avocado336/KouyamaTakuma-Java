package question_1_19;

public class Dog{
	// String型変数nameをフィールドとして宣言
	String name;
	// int型変数numをフィールドとして宣言
	int num;
	
	// Dogクラスをコンストラクタとして定義
	public Dog() {
		// nameフィールドを犬で初期化
		this.name = "犬";
	}
	
	// Dogクラス（）内で引数として整数を1つ受け取る
	public Dog(int num) {
		// 引数の値でnumフィールドを初期化
		this.num = num;
	}
}


