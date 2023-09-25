package test01;

import java.util.Scanner;

public class BaekJoon_10872{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		System.out.println(fibo(num));
		
		sc.close();

	}
	
	public static long fibo(long num) {
		if (num <= 1) {
			return 1;
		}
		return num*fibo(num-1);
	}

}
