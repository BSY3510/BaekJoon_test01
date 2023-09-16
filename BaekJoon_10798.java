package test01;

import java.util.Scanner;

public class BaekJoon_10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		char[][] array = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < line.length(); j++) {
				array[i][j] = line.charAt(j);
			}
		}
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (array[i][j] != 0) {
					sb.append(array[i][j]);
				}
			}
		}
		System.out.println(sb);
		
		
		sc.close();

	}

}
