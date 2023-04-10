package baekjoonSolve;

import java.util.Scanner;

/* 소인수분해 알고리즘은 암호학에서 엄청나게 중요한 부분이다. 특히, 소인수분해가 되냐, 안되냐는 모듈러 함수 결정에 있어서
 * 꽤 유용한 역할을 할 것이다. 따라서, 알고리즘을 이해하는 것이 중요하다.*/

public class Main {	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();

		/*i의 가동범위를 루트(A)까지 설정하는 것은 이미 유명한 소수 판정법이다.*/
		for(int i=2; i*i<=A; i++) {
			while(A % i == 0) {
				System.out.println(i);
				A /= i;
			}
		}
		
		if(A != 1) {
			System.out.println(A);
		}
	}
}