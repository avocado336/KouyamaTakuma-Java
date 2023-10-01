package SelfIntroduction3;

public class Person {
	
	// フィールドの宣言
	public String firstname;
	public int age;
	public double height;
	public double weight;
	public static int num = 0;
	public String lastName;
	
	// クラスフィールドの宣言をし初期値を代入
	public static int count = 0;
	
	// クラスメソッドの定義
	public static void printCount() {
		// sysoutで出力
		System.out.println("合計" + Person.count + "人です");
	}
	
	// Processクラス（）内で引数として文字列型を受け取る
	Person(String firstname,int age,double height,double weight) {
		// 引数の値でフィールドを初期化する
		this.firstname = firstname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// personクラスの変数名を処理が実行されるたびにカウントを1ずつたしていく
		Person.num = num +1;
		Person.count ++;
	}
	
	// コンストラクタでラストネームの引数として追加
	Person(String firstname,String lastName,int age,double height,double weight) {
		// thisを用いて↑のコンストラクタで明記したラストネーム以外の引数を含む中身を引っ張り出す
		this(firstname,age,height,weight);
		// 引数の値でフィールドを初期化する
		this.lastName = lastName;
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
		System.out.println("名前は" + firstname + "です");
		System.out.println("年は" + age + "です");
		// 変数を用いて出力する際に小数点以下を切り捨てするメソッドを用いて出力
		System.out.println("BMIは" + Math.floor(bmi) + "です");
		System.out.println("合計" + num + "人です");
	}
	
	

	

}
