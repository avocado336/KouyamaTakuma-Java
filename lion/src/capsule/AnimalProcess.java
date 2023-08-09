package capsule;


public class AnimalProcess {
	// フィールドを宣言
	private String name;
	private double weight;
	private int speed;
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public void setName(String name) {
		// 引数の値でフィールドを初期化
		this.name = name;
	}
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public String getName() {
		return this.name;
	}
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public void setWeight(double weight) {
		// 引数の値でフィールドを初期化
		this.weight = weight;
	}
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public double getWeight() {
		return this.weight;
	}
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public void setSpeed(int speed) {
		// 引数の値でフィールドを初期化
		this.speed = speed;
	}
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public int getSpeed() {
		return this.speed;
	}
	
}
