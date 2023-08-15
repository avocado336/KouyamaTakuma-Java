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

// 継承で親クラスの情報を子クラスに引っ張る
public class Sub_Name {
	// フィールドの宣言
	private String subname;

	// コンストラクタ
	public Sub_Name() {
	}
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public String getSubname() {
		return this.subname;
	}


}
