package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long pi = n;
		
		
		/*오일러 파이 공식 */
		for(long i=2; i*i<=n; i++) {
			if(n%i==0) {
				pi = pi/i*(i-1);
			}
			while(n%i==0) {
				n/=i;
			}
			
		}
		
		if(n != 1) {
			pi = pi/n*(n-1);
		}
		/*전문*/
		System.out.println(pi);
		
	}

}