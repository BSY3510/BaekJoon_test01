package test01;

import java.util.Scanner;

public class BaekJoon_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int max_num = 0;
		
		for (int i = 0; i < 81; i++) {
			int num = sc.nextInt();
			if (num > max_num) {
				max_num = num;
				x = i/9+1;
				y = i%9+1;
			}
		}
		if (max_num == 0) {
			x = 1;
			y = 1;
		}
		System.out.println(max_num);
		System.out.println(x + " " + y);
		
		sc.close();
	}

}
