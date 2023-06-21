package curriculum_B;

import java.text.DecimalFormat;
import java.text.Format;

public class Qes5 {

	public static void main(String[] args) {
		Format f = new DecimalFormat("000");
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		int[] numberss = {1,2,3,4,5,6,7,8,9};
		// 九九の計算
		for(int b = 0; b < 9; b++) {
			for(int a = 0; a < numbers.length; a++) {
				int ans = numbers[a] * numbers[b];
				if(a <= 0) {
				System.out.print(f.format(numbers[a]) + " " + "*" + " " + f.format(numbers[b]) + " " + "=" + " " + f.format(ans) + " ");
				} else {
					System.out.print("||" + f.format(numbers[a]) + " " + "*" + " " + f.format(numbers[b]) + " " + "=" + " " + f.format(ans) + " ");
				}
			}
		// 改行
			System.out.println("");
		}
	
	}

}
