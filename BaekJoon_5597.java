package test01;

import java.util.Scanner;

public class BaekJoon_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] l = new int[30];
		for (int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			l[n-1] = 1;
		}
		
		for (int i = 0; i < 30; i++) {
			if (l[i] == 0) {
				System.out.println(i+1);
			}
		}
		sc.close();

	}

}
