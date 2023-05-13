package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for(int i=0; i<count; i++) {

			long X = sc.nextLong();
			long Y = sc.nextLong();

			long distance = Y - X;
			int max = (int)Math.sqrt(distance);

			if(max == Math.sqrt(distance)) {
				System.out.println(2 * max - 1);;
			}
			else if(distance <= max * max + max) {
				System.out.println(2 * max);
			}
			else {
				System.out.println(2 * max + 1);
			}
		}
	}
}
