package test01;

import java.util.Scanner;

public class BaekJoon_9063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		int x_min = 10000;
		int x_max = -10000;
		int y_min = 10000;
		int y_max = -10000;
		for (int i = 0; i < caseNum; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x > x_max) {
				x_max = x;
			}
			if (y > y_max) {
				y_max = y;
			}
			if (x < x_min) {
				x_min = x;
			}
			if (y < y_min) {
				y_min = y;
			}
		}
		System.out.println((x_max-x_min)*(y_max-y_min));
		
		sc.close();

	}

}
