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

package theme2_play;

import theme2_method.Syori;

public class Zikkou {
	//メインメソッドを宣言
	public static void main(String[] args) {
		// クラスからインスタンスを生成し文字列を変数に代入
		Syori syori1 = new Syori("寿司","日本","和食");
		// インスタンスメソッドの呼び出し
		syori1.intro();
		syori1.time();
	}

}
