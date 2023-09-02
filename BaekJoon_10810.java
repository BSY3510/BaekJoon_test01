package test01;

import java.util.Scanner;

public class BaekJoon_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] l = new int[n];
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int finish = sc.nextInt();
			int num = sc.nextInt();
			for (int j = start; j <= finish; j++) {
				l[j-1] = num;
			}
		}
		for (int i = 0; i < l.length; i++) {
			if (i == l.length-1) {
				sb.append(l[i]);
			}
			else {
				sb.append(l[i]).append(" ");
			}
		}
		System.out.println(sb);
		sc.close();

	}

}
