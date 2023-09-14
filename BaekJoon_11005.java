package test01;

import java.util.Scanner;

public class BaekJoon_11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long decimal = sc.nextLong();
		int n = sc.nextInt();
		
		long temp = decimal;
		while (temp > 0) {
			if (temp % n >= 10) {
				char c = (char)((int)'A'+(temp%n)-10);
				sb.append(c);
			}
			else {
				sb.append((int)temp%n);
			}
			temp = temp/n;
		}
		
		System.out.println(sb.reverse());
		
		sc.close();

	}

}
