package test01;

import java.util.Scanner;

public class BaekJoon_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = num*2 - 1;
		
		for (int i = 1; i <= count; i++) {
			if (i <= num) {
				for (int j = (num-i); j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < i*2-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < i-num; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (count - i)*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		sc.close();

	}

}
