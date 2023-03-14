package baekjoonSolve;

import java.util.Scanner;

/*분할정복을 이용한 거듭제곱의 방식. https://hbj0209.tistory.com/43 참조.*/
/*백준 1629번 문제는 BigInteger를 사용하면 메모리 초과가 나서 사용할 수 없었음.*/

/*그렇다면, 모듈러 연산에서는 어떤 식으로 공식을 최적화 할 수 있는가?
 우리는 모듈러 연산에서 (a * b) mod C = (a mod C * b mod C)mod C 임을 기억해야 한다!
 (모듈려 연산은 암호학의 기초중의 기초이다!)*/

public class Main {	
	public static long C;
	
	public static long fpow(long A, long B) {
		/*지수가 1이면 뭐, 생각해 볼 가치도 없다.*/
		if (B == 1) {
			return A % C;
		}
		
		long temp = fpow(A, B/2);
		
		/*지수가 홀수이면, 2개로 나누고, +1을 생각하면 그만.*/
		if (B % 2 == 1) {
			return (temp * temp % C) * A % C;
		}
		/*지수가 짝수이면, 2개로 나누어서 생각하면 그만.*/
		return (temp * temp)%C;
	}
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		C = scanner.nextLong();
		
		System.out.println(fpow(A, B));
	}
}