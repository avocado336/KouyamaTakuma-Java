package lesson1_5;

public class Curriculum_New_1_5 {
    	// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
    	//  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
    	// 『山田太郎 18歳 170.5cm 62.2kg 寿司』

		// ↓↓format↓↓
    	// 「初めまして○○です」
    	// 「年齢は○○歳です」
    	// 「身長は○○cmです」
    	// 「体重は○○kgです」
    	// 「好きな食べ物は○○です」

		// Q1を下記に記載
	    	
	 String fvf = "寿司"; 
	    
		public static void main(String[] args) {
			String name = "山田太郎";
			String age = "18歳";
			String height = "170.5cm";
			String weight = "62.2kg";
			String fvf = new Curriculum_New_1_5().fvf;
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "です");
			System.out.println("身長は" + height + "です");
			System.out.println("体重は" + weight + "です");
	        System.out.println("好きな食べ物は" + fvf + "です");
	        
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること
	    // Q2を下記に記載
	        double BMI = 62.2 / 1.705 / 1.705;
	        System.out.println("BMIは" + (String.format("%.1f",BMI)) + "です" + "\n");
  	    	
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
	        name = "鈴木一郎です";
	        age = "24歳";
	        height = "168.5cm";
	        weight = "64.2kg";
	        fvf = "オムライス";
	        BMI = 64.2 / 1.685 / 1.685;
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "です");
			System.out.println("身長は" + height + "です");
			System.out.println("体重は" + weight + "です");
	        System.out.println("好きな食べ物は" + fvf + "です");
	        System.out.println("BMIは" + ((double)Math.round(BMI * 10) /10) + "です" );

    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

	}

}
