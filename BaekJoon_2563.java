package test01;

import java.util.Scanner;

public class BaekJoon_2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		
		int[][] array = new int[100][100];
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = y; j < (y+10) && j < 100; j++) {
				for (int k = x; k < (x+10) && k < 100; k++) {
					if (array[j][k] == 0 ) {
						array[j][k] = 1;
						s += 1;
					}
				}
			}
		}
		System.out.println(s);
		
		
		sc.close();

	}

}