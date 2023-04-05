package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [] housePos = new int[count];
		for(int i=0; i<count; i++) {
			housePos[i] = sc.nextInt();
		}
		Arrays.sort(housePos);

		if(count% 2 == 0) {
			System.out.println(housePos[count/2-1]);
		}
		else {
			System.out.println(housePos[count/2]);
		}
	}

}