package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		/*소수 판정 : 에라스토테네스의 체*/
		boolean [] primeNumList = new boolean[1001];
		primeNumList[0] = false;
		primeNumList[1] = false;
		primeNumList[2] = true;

		for(int i=2; i<1001; i++ ) {
			primeNumList[i] = true;
		}

		for(int i=2; i*i<1001; i++) {
			if(primeNumList[i]) {
				for(int j = i*i; j<1001; j+=i) {
					primeNumList[j] = false;
				}
			}
		}
		int T = scan.nextInt();
		/*break로 빠져나가기 시작*/
		
		for(int c = 0; c<T; c++) {
			int K = scan.nextInt();
			boolean available = false;
			outerloop:
			for(int i=2; i<334; i++) {
				for(int j=2; j<334; j++) {
					for(int k=3; k<334; k++) {
						if(i + j + k > K ) {
							System.out.println(0);
							break outerloop;
						}
						if(i+j+k == K && primeNumList[i] && primeNumList[j] && primeNumList[k]) {
							available = true;
							System.out.println(i + " " + j + " " + k);
							break outerloop;
						}
					}
				}
			}
		}
	}
}