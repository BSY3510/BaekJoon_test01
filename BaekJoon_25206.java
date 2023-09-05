package test01;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double count = 0;
		double score = 0;
		String[] grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
		double[] grade_s = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0,0};
		
		for (int i = 0; i < 20; i++) {
			String[] s = sc.nextLine().split(" ");
			int indx = Arrays.asList(grade).indexOf(s[2]);
			if (s[2].compareTo("P") != 0) {
				count += Double.parseDouble(s[1]);
			}
			score += (Double.parseDouble(s[1]) * grade_s[indx]);
		}
		System.out.printf("%.6f", score/count);
		
		sc.close();

	}

}
