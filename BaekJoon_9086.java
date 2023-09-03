package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9086 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			int len = s.length();
			sb.append(s.charAt(0)).append(s.charAt(len-1)).append("\n");
		}
		System.out.println(sb);
		
		bf.close();

	}

}