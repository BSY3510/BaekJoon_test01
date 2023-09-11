package test01;

import java.util.Scanner;

public class BaekJoon_2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int num = sc.nextInt();
		long sum = 0;
		int temp = 1;
		
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				sum += (c-'A'+10) * temp;
			}
			else {
				sum += (c-'0') * temp;
			}
			temp *= num;
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
