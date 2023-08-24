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

// 今後不変の数値が親クラスに入って一括変更処理をかけるために親クラスを抽象クラスとして入れ物のみ今回は定義
public class Process {
	// フィールドの宣言
	private String process;
	
	
	
	// コンストラクタ
	public Process() {
	}
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public Process(String process) {
		this.process = process;
	}
	// ゲッターメソッドを使ってフィールドの値を取り出す	
	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
}