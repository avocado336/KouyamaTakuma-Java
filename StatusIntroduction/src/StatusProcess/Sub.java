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

// ランダム関数のインポート
import java.util.Random;

// 継承でスーパークラスの情報をサブクラスに引っ張る
public class Sub extends Process {
	// フィールドの宣言
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	
	// 値を配列に代入
	int[] status2 = {hp,mp,attack,speed,defense};
	
	// コンストラクタ
	public Sub() {
		
		// for文
		for(int i = 0; i < status2.length; i ++) {
			Random rand = new Random(); // Random変数randを宣言
			status2[i] = rand.nextInt(1000); // int型変数に0-999までの乱数を代入
			
		}
		// sysoutで出力
		System.out.println("HP：" + status2[0]);
		System.out.println("MP：" + status2[1]);
		System.out.println("攻撃力：" + status2[2]);
		System.out.println("素早さ：" + status2[3]);
		System.out.println("防御力：" + status2[4]);
	}
}
