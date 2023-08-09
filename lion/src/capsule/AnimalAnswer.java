/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package capsule;

public class AnimalAnswer {

	public static void main(String[] args) {
		// クラスからインスタンスを生成して変数名を指定
		AnimalProcess process = new AnimalProcess();
		// インスタンスメソッドの呼び出し
		process.setName("ライオン");
		process.setWeight(2.1);
		process.setSpeed(80);
		// sysoutでゲッターメソッドで取り出した値を用いて出力
		System.out.println("動物名：" + process.getName());
		System.out.println("体長：" + process.getWeight() + "m");
		System.out.println("速度：" + process.getSpeed() + "km/h");
	}

}
