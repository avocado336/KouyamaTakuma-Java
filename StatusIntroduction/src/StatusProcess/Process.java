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

public class Process {
	
	// フィールドの宣言
	private String name;
	private String status;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	private String start;
	
	// セッターメソッドを使って（）の文字列を引数として受け取る
	public String setName(String name) {
		return this.name = name;
	}
	// ゲッターメソッドを使ってフィールドの値を取り出す
	public String getName() {
		return this.name;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMp() {
		return this.mp;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack() {
		return this.attack;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getDefense() {
		return this.defense;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	public String getStart() {
		return this.start;
	}
}