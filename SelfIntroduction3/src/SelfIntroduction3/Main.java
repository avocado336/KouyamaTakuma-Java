package SelfIntroduction3;

public class Main {

	public static void main(String[] args) {
		// クラスのインスタンスを生成し文字列を変数に代入
		Person person1 = new Person("鈴木太郎",20,1.7,60);
		Person person2 = new Person("山田花子",22,1.5,40);
		// インスタンスメソッドの呼び出し
		person1.print();	
		person2.print();
		
		// sysoutで出力
		System.out.println("合計" + Person.count + "人です");
		// クラスメソッドの呼び出し
		Person.printCount();
	}
}
