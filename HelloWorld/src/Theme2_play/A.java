/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

package Theme2_play;

// Theme2_methodパッケージのクラスBをインポートする
import Theme2_method.B;

public class A {
	//メインメソッドを宣言
	public static void main(String[] args) {
		// クラスからインスタンスを生成し文字列を変数に代入
		B kaiwa = new B("寿司");
		// インスタンスメソッドの呼び出し
		kaiwa.intro();
		kaiwa.time();
	}

}
