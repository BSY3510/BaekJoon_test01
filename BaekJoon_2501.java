package test01;

import java.util.Scanner;

public class BaekJoon_2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[num];
		int indx = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				l[indx] = i;
				indx += 1;
			}
			if (k == indx) {
				System.out.println(l[indx-1]);
				break;
			}
		}
		if (k > indx) {
			System.out.println(0);
		}
		
		sc.close();

	}

}
