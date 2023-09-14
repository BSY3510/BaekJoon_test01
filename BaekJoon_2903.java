package test01;

import java.util.Scanner;

public class BaekJoon_2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int init = 2;
		
		for (int i = 1; i <= n; i++) {
			init = init*2 - 1;
		}
		
		System.out.println(init*init);
		
		
		sc.close();

	}

}
