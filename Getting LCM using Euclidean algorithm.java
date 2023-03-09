package baekjoonSolve;

import java.util.Scanner;


public class Main {
	public static long GCD(long a, long b) {
		if(a % b == 0) {
			return b;
		}
		else {
			return GCD(b, a%b);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		if(A>B) {
			System.out.print(A*B /GCD(A, B));
		}
		else {
			System.out.print(A*B /GCD(B, A));
		}
	}	
}