package test01;

import java.util.Scanner;

public class BaekJoon_2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		int cycle = sc.nextInt();
		for (int i = 0; i < cycle; i++) {
			int remain = sc.nextInt();
			sb.append(remain/quarter).append(" ").append(remain % quarter / dime).append(" ").append(remain % quarter % dime / nickel).append(" ").append(remain % quarter % dime % nickel / penny);
			sb.append("\n");
		}
		System.out.println(sb);
		
		sc.close();

	}

}
