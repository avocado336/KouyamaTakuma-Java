/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package P_Answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import P_Information.Information;

public class Answer {

	public static void main(String[] args) {
		
		System.out.println("0～10の数字をカンマ区切りで入力してください");
		
		Scanner sc = new Scanner(System.in);
		// String変数にテキストを入力できるnextLineを代入
		String usename = sc.nextLine();
		
		// サブクラスのインスタンスを生成
		Information information1 = new Information();
		
		System.out.println("昇順、降順どちらにしますか");
		System.out.println("昇順なら0,降順なら1を入力してください");
		
		// String型変数に敵をスト入力できるnextLineを代入
		String usename2 = sc.nextLine();
		
		// String型配列にスキャナークラスで命名した変数を代入しスプリット文を用いて分割
		String[] name2 = usename.split(",");
		// ソートクラスを用いて昇順に並べる指示
		
		// if文を用いて入力する値が0なら昇順、1なら降順になる条件分岐を明記
		if(usename2.equals("0")) {
			Arrays.sort(name2);
		} else if(usename2.equals("1")) {
			Arrays.sort(name2,
			Collections.reverseOrder());
		}
		
		// for文で入力した文字（,）の回数分処理を繰り返す
		for(int i = 0; i < name2.length; i ++) {
			// String配列変数にサブクラスから持ってきたメソッドをname2の数だけ代入
			String[] name3 = Information.pre(name2[i]);
			// パースダブルクラスを用いてString型配列をdouble型に変更
			double dou = Double.parseDouble(name3[2]);

			// sysoutで配列内の数字を出力
			System.out.println("都道府県名：" + name3[0] );
			System.out.println("県庁所在地：" + name3[1]);
			System.out.println("面積：" + dou + "km2");	
			System.out.println();
		}	
		sc.close();		
	}
}