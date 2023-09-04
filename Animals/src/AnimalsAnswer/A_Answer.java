/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package AnimalsAnswer;

//スキャナークラスのインポート
import java.util.Scanner;

import AnimalsProcess.Information;

public class A_Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String変数にテキストを入力できるnextLineを代入
		String usename = sc.nextLine();
		
		// サブクラスのインスタンスを生成
		Information information1 = new Information();
		
		System.out.println("コンソールに文字を入力してください");	
		
		// String型配列にスキャナークラスで命名した変数を代入しスプリット文を用いて分割
		String[] name2 = usename.split(",");
		// for文で入力した文字（,）の回数分処理を繰り返す
		for(int i = 0; i < name2.length; i ++) {
			// String型配列に上記で記載した繰り返しfor文の変数を代入しスプリット文を用いて分割
			String[] name3 = name2[i].split(":");
			// sysoutで配列内の数字を出力
			System.out.println("動物名：" + name3[0]);
			System.out.println("体長：" + name3[1] + "m");
			System.out.println("速度：" + name3[2] + "km/h");	
			// sysoutでサブクラスから持ってきた変数を出力
			System.out.println("学名：" + information1.getD_kinds(name3[0]));
			System.out.println();
		}	
		sc.close();
	}

}
