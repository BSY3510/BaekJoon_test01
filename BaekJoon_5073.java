package test01;

import java.util.Scanner;

public class BaekJoon_5073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int lon = 0;
			int remain = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0 && a==b && b==c) {
				break;
			}
			if (a >= b && a >= c) {
				lon = a;
				remain = b+c;
			}
			else if (b >= a && b >= c) {
				lon = b;
				remain = a+c;
			}
			else if (c >= a && c >= b) {
				lon = c;
				remain = a+b;
			}
			
			if (lon < remain) {
				if (a == b && b == c) {
					System.out.println("Equilateral");
				}
				else if (a==b || b==c || a==c) {
					System.out.println("Isosceles");
				}
				else if (a != b && a != c && b != c) {
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}
		
		sc.close();

	}

}
