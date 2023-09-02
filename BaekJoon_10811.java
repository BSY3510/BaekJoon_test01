package test01;

import java.util.Scanner;

public class BaekJoon_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] l = new int[n+1];
		for (int i = 1; i < l.length; i++) {
			l[i] = i;
		}
		
		for (int j = 0; j < m; j++) {
			int start = sc.nextInt();
			int finish = sc.nextInt();
			for (int k = 0; k < (finish-start)/2+1; k++) {
				int temp = l[start+k];
				l[start+k] = l[finish-k];
				l[finish-k] = temp;
			}
			
		}
		for (int i = 1; i < l.length; i++) {
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