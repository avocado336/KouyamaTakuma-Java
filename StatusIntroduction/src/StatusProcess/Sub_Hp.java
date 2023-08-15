/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package StatusProcess;

import java.util.Random;

// 継承でスーパークラスの情報をサブクラスに引っ張る
public class Sub_Hp extends Process {
	// フィールドの宣言
	private int hp;

	// コンストラクタ
	public Sub_Hp() {
		
		Random rand = new Random(); // Random変数randを宣言
		hp = rand.nextInt(1000);// int型変数に0-999までの乱数を代入	
	}
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public void setHp(int hp) {
		this.hp = hp;
	}

	// ゲッターメソッドを使ってフィールドの値を取り出す
	public int getHp() {
		return this.hp;
	}


}
