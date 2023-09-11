package test01;

import java.util.Scanner;

public class BaekJoon_2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int num = sc.nextInt();
		long sum = 0;
		
		int len = s.length();
		char[] l = new char[len];
		
		for (int i = 0; i < l.length; i++) {
			l[i] = s.charAt(i);
		}
		
		for (int i = l.length-1; i >= 0; i--) {
			if ((int)l[i] >= 65) {
				sum += ((int)l[i] - 55)*Math.pow(num, i);
			}
			else {
				sum += (int)l[i]*Math.pow(num, i);
			}
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
