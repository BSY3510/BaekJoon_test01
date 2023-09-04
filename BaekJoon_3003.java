package test01;

import java.util.Scanner;

public class BaekJoon_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] chess = {1,1,2,2,2,8};
		int[] answer = new int[6];
		for (int i = 0; i < chess.length; i++) {
			int num = sc.nextInt();
			answer[i] = chess[i] - num;
		}
		for (int j = 0; j < answer.length; j++) {
			if (j == answer.length-1) {
				System.out.print(answer[j]);
			}
			else {
				System.out.print(answer[j] + " ");
			}
		}

		sc.close();

	}

}
