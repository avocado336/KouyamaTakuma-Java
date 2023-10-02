package SelfIntroduction4;

public class Main {

	public static void main(String[] args) {
		// クラスのインスタンスを生成し文字列を変数に代入
		Person person1 = new Person("鈴木","太郎",20,1.7,60);
		Person person2 = new Person("山田","花子",22,1.5,40);
		Car car1 = new Car();
		Bicycle bicycle1 = new Bicycle();
		// インスタンスメソッドの呼び出し
		person1.print();	
		person2.print();
		// インスタンスメソッドを呼び出し引数にpersonクラスで定義したフルネームメソッドを代入
		car1.setOwner(person1.fullName());
		bicycle1.setOwner(person2.fullName());
		person1.buy(car1);
		person2.buy(bicycle1);
		
		// sysoutで出力
		System.out.println("合計" + Person.count + "人です");
		System.out.println(car1.getOwner());
		System.out.println(bicycle1.getOwner());
		// クラスメソッドの呼び出し
		Person.printCount();	
	}
}