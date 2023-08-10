package theme2_method;
// import分でSimpleDateFormatとutilDateをインポート
import java.text.SimpleDateFormat;
import java.util.Date;

public class Process {
	// フィールド宣言
	protected String food;
	protected String country;
	protected String japaneseFood;
	
	// Processクラス（）内で引数として文字列型を受け取る
	public Process(String food,String country,String japaneseFood) {
		// 引数の値でフィールドを初期化する
		this.food = food;
		this.country = country;
		this.japaneseFood = japaneseFood;
	}
	// メソッドを定義しsysoutで出力
	public void intro() {
		System.out.println("こんにちは！ここは" + country + "です！");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + japaneseFood + "です");
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
