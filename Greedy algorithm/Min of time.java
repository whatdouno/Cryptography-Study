package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [] personTime = new int[count];
		int sum = 0;
		for(int i=0; i<count; i++) {
			personTime[i] = sc.nextInt();
		}
		Arrays.sort(personTime);

		for(int i=0; i<count; i++) {
			sum += (count-i)*personTime[i];
		}
		System.out.println(sum);
	}

}