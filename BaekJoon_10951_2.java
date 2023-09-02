package test01;

import java.util.Scanner;

public class BaekJoon_10951_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
		sc.close();

	}

}
