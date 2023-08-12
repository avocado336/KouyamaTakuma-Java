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

package StatusAnswer;

// スキャナークラスのインポート
import java.util.Scanner;

import StatusProcess.Process;
import StatusProcess.Sub;

public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String変数nameにテキストを入力できるnextLineを代入
		String name = sc.nextLine();
		// スーパークラスのクラスをインスタンス生成
		Process process1 = new Process();
		// インスタンスメソッドの呼び出し
		process1.setName("名前");
		name = process1.setName(name);
		process1.setStatus("ステータス");
		process1.setStart("冒険");
		
		// sysoutで出力
		System.out.println("こんにちは「"+ process1.getName() + "」さん");
		System.out.println(process1.getStatus());
		// サブクラスのクラスをインスタンス生成
		Sub sub = new Sub();
		System.out.println();
		System.out.println("さあ" + process1.getStart() + "にでかけよう！");
	}

}