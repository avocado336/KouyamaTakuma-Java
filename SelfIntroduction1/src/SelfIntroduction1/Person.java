package SelfIntroduction1;

public class Person {
	
	// フィールドの宣言
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int num = 0;
	
	// Processクラス（）内で引数として文字列型を受け取る
	Person(String name,int age,double height,double weight) {
		// 引数の値でフィールドを初期化する
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// personクラスの変数名を処理が実行されるたびにカウントを1ずつたしていく
		Person.num = num +1;
	}
	
	// メソッドを定義
	public double bmi() {
		// 返り値で計算式を入れる
		return this.weight / (height * height);
		
	}
	// メソッドの定義
	public void print() {
		// メソッドで定義した変数をdouble型に代入
		double bmi = this.bmi();
		// sysoutで出力
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
		// 変数を用いて出力する際に小数点以下を切り捨てするメソッドを用いて出力
		System.out.println("BMIは" + Math.floor(bmi) + "です");
		System.out.println("合計" + num + "人です");
	}
	
	

	

}