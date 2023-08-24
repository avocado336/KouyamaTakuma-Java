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

import StatusProcess.Sub_Infomation;

public class Answer {

	public static void main(String[] args) {
		// スキャナークラスを生成し変数に代入
		Scanner sc = new Scanner(System.in);
		// String変数にテキストを入力できるnextLineを代入
		String usename = sc.nextLine();
		
		// インスタンスメソッドの呼び出し
		Sub_Infomation infomation1 = new Sub_Infomation();
		infomation1.setProcess(usename);
		
		// sysoutで出力
		System.out.println("こんにちは「"+ infomation1.getProcess() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + infomation1.getHp());
		System.out.println("MP：" + infomation1.getMp());
		System.out.println("攻撃力：" + infomation1.getAttack());
		System.out.println("素早さ：" + infomation1.getSpeed());
		System.out.println("防御力：" + infomation1.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
		sc.close();
	}

}