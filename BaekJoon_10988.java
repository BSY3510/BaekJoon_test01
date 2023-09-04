package test01;

import java.util.Scanner;

public class BaekJoon_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int len = s.length();
		boolean answer = true;
		
		for (int i = 0; i < len/2; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(len-1-i);
			if (c1 != c2) {
				answer = false;
				break;
			}
		}
		if (answer == true) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();

	}

}
