package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_27866 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		int i = Integer.parseInt(bf.readLine());

		System.out.println(s.charAt(i-1));
		
		bf.close();

	}

}
