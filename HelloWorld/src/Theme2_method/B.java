package Theme2_method;

import java.text.SimpleDateFormat;
// importでTimestampをインポート
import java.util.Date;

public class B {
	// フィールド宣言
	protected String name;
	
	// Bクラス（）内で引数として整数を1つ受け取る
	public B(String name) {
		// 引数の値でフィールドを初期化
		this.name = name;
	}

	// メソッドを定義しsysoutで出力
	public void intro() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この" + name + "はうまい");
		System.out.println(name + "は和食です");
	}

	public void time() {
		// dateクラスを用いてインスタンス生成
		Date d = new Date();
		 // simpleDateFormatクラスを用いてインスタンスを生成
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 // sysoutで出力
		 System.out.println("今の現在日時は" + sdf.format(d) + "です");
	}
}
