package SelfIntroduction4;

public class Vehicle {
	
	// フィールドをprivateで宣言
	private String owner;
	
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public String getOwner() {
		return this.owner;
	}
	// セッターメソッドを使って（）の文字列を引数として受け取る	
	public void setOwner(String owner) {
		this.owner = owner;
	}		
}