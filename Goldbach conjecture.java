package baekjoonSolve;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static boolean isPrime(int n){
		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		
		for(int j=0; j<count; j++) {
			int num = scanner.nextInt();

			for(int i=num/2; i>=0; i--) {
				if(isPrime(i) == true) {
					int anotherNum = num - i;
					if(isPrime(anotherNum) == true) {
						System.out.println(i + " " + anotherNum);
						break;

					}
				}
			}
		}
	}
}

