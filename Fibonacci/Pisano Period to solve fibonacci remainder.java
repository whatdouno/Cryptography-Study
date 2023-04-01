package baekjoonSolve;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	/*나누는 나머지 = 1000000*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*피사노 주기를 이용해서 풀어보겠다.(Pisano Period)*/
		/* 설명 : 주기의 길이를 P라고 하면, 
		 * N번째 피보나치 수를 M으로 나눈 나머지는 N%P번째 피보나치 수를 M으로 나눈 나머지와 같다.
		 * (주기가 M = 10^k(k>2) 꼴일때, PP = 15 * 10 ^(k-1)) 
		 * 이번 case같은 경우, PP = 1500000. */
		BigInteger num = sc.nextBigInteger();
		int M = 1000000;
		BigInteger PisaroPeriod = new BigInteger("1500000");
		long [] fibonacci = new long[1500001];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		/*어차피 우리의 출력값의 목표는 1000000으로 나눈 나머지를 기대하는 것이니.*/
		for(int i = 2; i <= 1500000; i++) {
			fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % M;
		}
		
		BigInteger numDividebyPP = num.remainder(PisaroPeriod);
		int nPP = Integer.parseInt(numDividebyPP.toString());		
		System.out.println(fibonacci[nPP]%1000000);

	}
 
}