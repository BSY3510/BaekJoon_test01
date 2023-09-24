package test01;

import java.util.Scanner;

public class BaekJoon_14215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lon = 0;
		int remain = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
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
			System.out.println(lon+remain);
		}
		else {
			System.out.println(remain+(remain-1));
		}

		sc.close();

	}
}
