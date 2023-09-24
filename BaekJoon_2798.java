package test01;

import java.util.Scanner;

public class BaekJoon_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cardNum = sc.nextInt();
		int numLimit = sc.nextInt();
		int[] array = new int[cardNum];
		
		for (int i = 0; i < cardNum; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = 0;
		for (int i = 0; i < array.length-2; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				for (int k = j+1; k < array.length; k++) {
					int isMax = array[i] + array[j] + array[k];
					if ((isMax > max) && (isMax <= numLimit)) {
						max = isMax;
					}
				}
			}
		}
		System.out.println(max);
		
		sc.close();

	}

}
