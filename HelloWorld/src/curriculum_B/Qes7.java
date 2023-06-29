package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("生徒の人数を入力してください（2以上）:");
		
		Scanner sc = new Scanner(System.in);
		// sc.nextIntをint型変数personに代入してpersonに文字を入れられるようにする
		int person = sc.nextInt();
		// 多次元配列を用いて生徒の人数person、教科の数4を指定
		int[][] line = new int[person][4];
		
		// for文を用いて変数iがpersonと=になるまで処理を繰り返す
		for(int i = 0; i < person; i++) {
			
			// 配列からsysoutするのでi+1を行い一人目から処理をスタートするようにする
			System.out.println((i + 1) + "人目の『英語』の点数を入力してください：");
			line[i][0] =sc.nextInt();
			System.out.println((i + 1) + "人目の『数学』の点数を入力してください：");
			line[i][1] =sc.nextInt();
			System.out.println((i + 1) + "人目の『理科』の点数を入力してください：");
			line[i][2] =sc.nextInt();
			System.out.println((i + 1) + "人目の『社会』の点数を入力してください：");
			line[i][3] =sc.nextInt();
			System.out.println();
			}
		
		for(int i = 0; i < person; i++) {
			// 多次元配列で宣言したline変数で何人目の何の教科を出力するのを指定
			int ave = (line[i][0] + line[i][1] + line[i][2] + line[i][3]) / 4;
			System.out.println((i + 1) + "人目の平均点は" + ave + "点です。");
		}
		
		// int型変数で初期値を設定
		int subave1 = 0;
		int subave2 = 0;
		int subave3 = 0;
		int subave4 = 0;
		
		for(int i = 0; i < person; i++) {
			subave1 += line[i][0];	
			// 変数に多次元配列で宣言したlineの１行目の○番目の教科を順に足していく繰り返しfor文処理
		}
		System.out.println("英語の平均点は" + subave1 / person  + "点です");
		
		for(int i = 0; i < person; i++) {
			subave2 += line[i][1];	
		}
		System.out.println("数学の平均点は" + subave2 / person  + "点です");
		
		for(int i = 0; i < person; i++) {
			subave3 += line[i][2];	
		}
		System.out.println("理科の平均点は" + subave3 / person  + "点です");
		
		for(int i = 0; i < person; i++) {
			subave4 += line[i][3];	
		}
		System.out.println("社会の平均点は" + subave4 / person  + "点です");
		
		System.out.println("全体の平均点は" + (subave1 / person + subave2 / person + subave3 / person + subave4 / person)/4 + "です。");
		sc.close();
	}
}



