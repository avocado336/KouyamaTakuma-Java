package curriculum_B;

import java.text.DecimalFormat;
import java.text.Format;

public class Qes4 {

	public static void main(String[] args) {
		Format f = new DecimalFormat("00");
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		// 九九の計算
		for(int a = 0; a < numbers.length; a++) {
			for(int b = 0; b < numbers.length; b++) {
				int ans = numbers[a] * numbers[b];
				if(b <= 0) {
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

	

