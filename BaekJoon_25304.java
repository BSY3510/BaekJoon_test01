package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_25304 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		long total = Integer.parseInt(bf.readLine());
		long kind = Integer.parseInt(bf.readLine());
		long product = 0;
		long price = 0;
		long amount = 0;
		for (int i = 0; i < kind; i++) {
			String[] info = (bf.readLine()).split(" ");
			product = Integer.parseInt(info[0]);
			price = Integer.parseInt(info[1]);
			amount += product * price;
		}

		if (amount == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		bf.close();

	}

}
