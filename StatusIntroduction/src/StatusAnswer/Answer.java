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

import StatusProcess.Sub_Attack;
import StatusProcess.Sub_Defense;
import StatusProcess.Sub_Hp;
import StatusProcess.Sub_Mp;
import StatusProcess.Sub_Name;
import StatusProcess.Sub_Speed;

public class Answer {

	public static void main(String[] args) {
		// スキャナークラスを生成し変数に代入
		Scanner sc = new Scanner(System.in);
		// String変数にテキストを入力できるnextLineを代入
		String usename = sc.nextLine();
		
		
		// サブクラスのインスタンスを生成
		Sub_Name name1 = new Sub_Name();
		// インスタンスメソッドの呼び出し
		name1.setSubname(usename);
		Sub_Hp hp1 = new Sub_Hp();
		Sub_Mp mp1 = new Sub_Mp();
		Sub_Attack attack1 = new Sub_Attack();
		Sub_Speed speed1 = new Sub_Speed();
		Sub_Defense defense1 = new Sub_Defense();


		
		// sysoutで出力
		System.out.println("こんにちは「"+ name1.getSubname() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp1.getHp());
		System.out.println("MP：" + mp1.getMp());
		System.out.println("攻撃力：" + attack1.getAttack());
		System.out.println("素早さ：" + speed1.getSpeed());
		System.out.println("防御力：" + defense1.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
		sc.close();
	}

}