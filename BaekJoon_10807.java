package test01;

import java.util.Scanner;

public class BaekJoon_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] l = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		
		int num = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (l[i] == num) {
				count += 1;
			}
		}
		System.out.println(count);
		
		sc.close();

	}

}
