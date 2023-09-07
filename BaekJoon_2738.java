package test01;

import java.util.Scanner;

public class BaekJoon_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] l = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				l[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int num = sc.nextInt();
				num += l[i][j];
				if (j == (m-1)) {
					sb.append(num).append("\n");
				}
				else {
					sb.append(num).append(" ");
				}
			}
		}
		
		System.out.println(sb);
		
		sc.close();

	}

}
