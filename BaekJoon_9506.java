package test01;

import java.util.Scanner;

public class BaekJoon_9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			if (num == -1) {
				break;
			}
			int[] l = new int[num];
			StringBuilder sb = new StringBuilder();
			sb.append(num + " = ");
			int indx = 0;
			for (int i = 1; i < num; i++) {
				if (num%i == 0) {
					l[indx] = i;
					indx += 1;
				}
			}
			int total = 0;
			for (int i = 0; i < indx; i++) {
				total += l[i];
				if (i == indx-1) {
					sb.append(l[i]);
				}
				else {
					sb.append(l[i]).append(" + ");
				}
			}
			if (total == num) {
				System.out.println(sb);
			}
			else {
				System.out.println(num + " is NOT perfect. ");
			}
		}
		
		sc.close();

	}

}
